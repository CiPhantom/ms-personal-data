package org.comedy.app.controller.mapper;

import javax.annotation.processing.Generated;
import org.comedy.app.controller.data.LoginRequest;
import org.comedy.domain.data.Credential;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-18T21:47:37+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class LoginRequestMapperImpl implements LoginRequestMapper {

    @Override
    public LoginRequest map(Credential credential) {
        if ( credential == null ) {
            return null;
        }

        LoginRequest loginRequest = new LoginRequest();

        loginRequest.setLogin( credential.getLogin() );
        loginRequest.setPassword( credential.getPassword() );

        return loginRequest;
    }

    @Override
    public Credential map(LoginRequest loginRequest) {
        if ( loginRequest == null ) {
            return null;
        }

        Credential credential = new Credential();

        credential.setLogin( loginRequest.getLogin() );
        credential.setPassword( loginRequest.getPassword() );

        return credential;
    }
}
