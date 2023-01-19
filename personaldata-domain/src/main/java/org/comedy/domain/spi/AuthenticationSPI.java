package org.comedy.domain.spi;

import org.comedy.domain.data.Credential;
import org.comedy.domain.data.Subscriber;
import org.comedy.domain.exception.CountryNotFoundException;

public interface AuthenticationSPI {
    Subscriber subscribeNewUser(Subscriber newUser) throws CountryNotFoundException;

    Credential authenticate(Credential credential) throws UserNotFoundException;
}
