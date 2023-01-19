package org.comedy.app.controller.handler;

import org.comedy.app.controller.AuthenticationController;
import org.comedy.app.controller.handler.structure.Error;
import org.comedy.app.controller.handler.structure.ErrorResponse;
import org.comedy.domain.exception.CountryNotFoundException;
import org.comedy.domain.exception.error.ErrorCode;
import org.comedy.domain.spi.UserNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice(assignableTypes = {AuthenticationController.class})
public class UserControllerExceptionHandler {


    @ExceptionHandler(CountryNotFoundException.class)
    ErrorResponse handleCountryNotFoundException(CountryNotFoundException ex) {
        Error error = Error.builder().errorCode(ErrorCode.COUNTRY_DOES_NOT_EXIST)
                .message(ErrorCode.COUNTRY_DOES_NOT_EXIST.getErrorMessage().formatted(ex.getCountry())).build();
        return ErrorResponse.builder()
                .errors(List.of(error))
                .build();
    }

    @ExceptionHandler(UserNotFoundException.class)
    ErrorResponse handleUserNotFoundException(UserNotFoundException ex) {
        Error error = Error.builder().errorCode(ErrorCode.LOGIN_OR_PASSWORD_INCORRECT)
                .message(ErrorCode.LOGIN_OR_PASSWORD_INCORRECT.getErrorMessage().formatted(ex.getLogin())).build();
        return ErrorResponse.builder()
                .errors(List.of(error))
                .build();
    }
}
