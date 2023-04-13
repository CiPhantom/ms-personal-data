package org.comedy.domain.service.impl;

import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.spi.AuthenticationSPI;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AuthenticationDomainServiceTest {

    @Mock
    private AuthenticationSPI authenticationSPI;

    @InjectMocks
    private AuthenticationDomainService authenticationDomainService;

    @Test
    @DisplayName("Testing nominal case is ok.")
    void testSubscribe() throws CountryNotFoundException {
        var subscriber = getSubscriber();
        when(authenticationSPI.subscribeNewUser(subscriber)).thenReturn(subscriber);
        authenticationDomainService.subscribe(subscriber);
        verify(authenticationSPI).subscribeNewUser(subscriber);
    }

    @Test
    void authenticate() {
        //TODO: later
    }

    private Subscriber getSubscriber() {
        return Subscriber.builder()
                .biography("biography")
                .email("email")
                .birthCountry("country")
                .login("login")
                .firstname("firstname")
                .lastname("lastname")
                .login("login")
                .password("password")
                .build();
    }
}