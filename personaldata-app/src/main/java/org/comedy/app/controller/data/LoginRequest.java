package org.comedy.app.controller.data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    @NotBlank
    @Size(min = 6)
    private String login;
    @NotBlank
    @Size(min = 10)
    private String password;
}
