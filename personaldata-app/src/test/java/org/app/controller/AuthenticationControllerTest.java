package org.app.controller;

import org.comedy.app.controller.AuthenticationController;
import org.comedy.app.controller.data.LoginRequest;
import org.comedy.app.controller.data.SubscribeRequest;
import org.comedy.app.controller.mapper.LoginRequestMapper;
import org.comedy.app.controller.mapper.SubscriberMapper;
import org.comedy.domain.data.Credential;
import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.service.AuthenticationService;
import org.comedy.domain.spi.UserNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthenticationControllerTest {
    @InjectMocks
    AuthenticationController authenticationController;

    @Mock
    AuthenticationService authenticationService;

    @Mock
    LoginRequestMapper loginRequestMapper;

    @Mock
    SubscriberMapper subscriberMapper;

    @Test
    void userSubscribe_WhenAuthenticationServiceThrowsCountryNotFound_ThenThrowItAgain() throws CountryNotFoundException {
        when(authenticationService.subscribe(any())).thenThrow(CountryNotFoundException.class);

        assertThrows(CountryNotFoundException.class, () -> authenticationController.userSubscribe(any()));
    }

    @Test
    void userSubscribe_WhenAuthenticationServiceOk_ThenAllOk() throws CountryNotFoundException {
        var subscribeRequest = new SubscribeRequest();
        var subscriber = Subscriber.builder().build();
        when(authenticationService.subscribe(subscriber)).thenReturn(subscriber);
        when(subscriberMapper.map(subscriber)).thenReturn(subscribeRequest);
        when(subscriberMapper.map(subscribeRequest)).thenReturn(subscriber);

        authenticationController.userSubscribe(subscribeRequest);

        verify(subscriberMapper).map(subscriber);
        verify(subscriberMapper).map(subscribeRequest);
    }

    @Test
    void userAuthenticate_whenAuthenticateServiceThrowsUserNotFoundException_thenThrowItAgain() throws UserNotFoundException {
        when(authenticationService.authenticate(any())).thenThrow(UserNotFoundException.class);

        assertThrows(UserNotFoundException.class, () -> authenticationController.userAuthenticate(any()));
    }

    @Test
    void userAuthenticate_WhenAuthenticationServiceOk_ThenAllOk() throws CountryNotFoundException, UserNotFoundException {
        var loginRequest = new LoginRequest();
        var credential = new Credential();
        when(authenticationService.authenticate(credential)).thenReturn(credential);
        when(loginRequestMapper.map(loginRequest)).thenReturn(credential);
        when(loginRequestMapper.map(credential)).thenReturn(loginRequest);

        authenticationController.userAuthenticate(loginRequest);

        verify(loginRequestMapper).map(credential);
        verify(loginRequestMapper).map(loginRequest);
    }
}
