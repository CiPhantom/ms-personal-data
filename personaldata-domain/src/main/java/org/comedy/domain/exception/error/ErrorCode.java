package org.comedy.domain.exception.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    COUNTRY_DOES_NOT_EXIST("Country %s does not exist."),
    LOGIN_OR_PASSWORD_INCORRECT("Login or password incorrect for login %s");

    private final String errorMessage;
}
