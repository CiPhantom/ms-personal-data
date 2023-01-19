package org.comedy.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.comedy.domain.data.Credential;
import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.service.AuthenticationService;
import org.comedy.domain.spi.AuthenticationSPI;
import org.comedy.domain.spi.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationDomainService implements AuthenticationService {

    private final AuthenticationSPI authenticationSPI;

    @Override
    public Subscriber subscribe(Subscriber subscriber) throws CountryNotFoundException {
        return authenticationSPI.subscribeNewUser(subscriber);
    }

    @Override
    public Credential authenticate(Credential credential) throws UserNotFoundException {
        return authenticationSPI.authenticate(credential);
    }
}
