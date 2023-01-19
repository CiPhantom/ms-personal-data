package org.comedy.domain.spi;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserNotFoundException extends Exception {
    private final String login;
}
