package org.comedy.app.controller.mapper;

import org.comedy.app.controller.data.LoginRequest;
import org.comedy.domain.data.Credential;
import org.mapstruct.Mapper;

@Mapper
public interface LoginRequestMapper {
    LoginRequest map(Credential credential);

    Credential map(LoginRequest loginRequest);
}
