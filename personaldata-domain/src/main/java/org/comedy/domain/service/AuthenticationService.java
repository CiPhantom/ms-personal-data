package org.comedy.domain.service;

import org.comedy.domain.data.Credential;
import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.spi.UserNotFoundException;

public interface AuthenticationService {
    Subscriber subscribe(Subscriber subscriber) throws CountryNotFoundException;

    Credential authenticate(Credential subscriber) throws UserNotFoundException;
}
