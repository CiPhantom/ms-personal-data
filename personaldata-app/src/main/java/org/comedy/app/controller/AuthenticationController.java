package org.comedy.app.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.comedy.app.controller.data.LoginRequest;
import org.comedy.app.controller.data.SubscribeRequest;
import org.comedy.app.controller.mapper.LoginRequestMapper;
import org.comedy.app.controller.mapper.SubscriberMapper;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.service.AuthenticationService;
import org.comedy.domain.spi.UserNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final SubscriberMapper subscriberMapper;

    private final LoginRequestMapper loginRequestMapper;

    @PostMapping(path = "/subscribe", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public SubscribeRequest userSubscribe(@Valid @RequestBody SubscribeRequest subscribeRequest) throws CountryNotFoundException {
        return subscriberMapper.map(authenticationService.subscribe(subscriberMapper.map(subscribeRequest)));
    }

    @PostMapping(path = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public LoginRequest userAuthenticate(@Valid @RequestBody LoginRequest loginRequest) throws UserNotFoundException {
        return loginRequestMapper.map(authenticationService.authenticate(loginRequestMapper.map(loginRequest)));
    }
}
