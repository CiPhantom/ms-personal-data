package org.comedy.infra.service;

import lombok.RequiredArgsConstructor;
import org.comedy.domain.data.Credential;
import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.spi.AuthenticationSPI;
import org.comedy.domain.spi.UserNotFoundException;
import org.comedy.infra.entity.CountryEntity;
import org.comedy.infra.entity.UserEntity;
import org.comedy.infra.mapper.UserEntityMapper;
import org.comedy.infra.repository.CountryRepository;
import org.comedy.infra.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationInfraService implements AuthenticationSPI {
    private final UserRepository userRepository;

    private final CountryRepository countryRepository;

    private final UserEntityMapper userEntityMapper;

    private final SaltingPasswordComponent saltingPasswordComponent;

    @Override
    public Subscriber subscribeNewUser(Subscriber newUser) throws CountryNotFoundException {
        CountryEntity country = Optional.ofNullable(countryRepository.findFirstByEnglishName(newUser.getBirthCountry()))
                .orElseThrow(() -> new CountryNotFoundException(newUser.getBirthCountry()));
        UserEntity entity = userEntityMapper.map(newUser);
        entity.setCountryId(country.getId());
        entity.setPassword(saltingPasswordComponent.encodePassword(entity.getPassword()));
        userRepository.save(entity);
        return newUser;
    }

    @Override
    public Credential authenticate(Credential credential) throws UserNotFoundException {
        UserEntity user = Optional.ofNullable(userRepository.findByLogin(credential.getLogin()))
                .orElseThrow(() -> new UserNotFoundException(credential.getLogin()));
        if (!saltingPasswordComponent.matches(credential.getPassword(), user.getPassword())) {
            throw new UserNotFoundException(credential.getLogin());
        }
        return credential;
    }
}
