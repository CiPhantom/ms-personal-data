package org.comedy.infra.service;

import lombok.RequiredArgsConstructor;
import org.comedy.domain.data.Country;
import org.comedy.domain.spi.CountrySPI;
import org.comedy.infra.mapper.CountryEntityMapper;
import org.comedy.infra.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryInfraService implements CountrySPI {

    private final CountryRepository countryRepository;

    private final CountryEntityMapper countryEntityMapper;

    @Override
    public Optional<Country> getCountryIdByEnglishName(String englishName) {
        return Optional.ofNullable(countryEntityMapper.map(countryRepository.findFirstByEnglishName(englishName)));
    }
}
