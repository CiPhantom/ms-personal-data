package org.comedy.app.controller.data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SubscribeRequest {
    @NotBlank
    @Size(min = 6)
    private String login;
    @NotBlank
    @Size(min = 10)
    private String password;
    @NotBlank
    @Size(min = 2)
    private String firstname;
    @NotBlank
    @Size(min = 2)
    private String lastname;
    private LocalDate birthday;
    @NotBlank
    private String birthCountry;
    @Email
    private String email;
    @NotBlank
    @Size(min = 50)
    private String biography;
    @NotBlank
    @Size(min = 50)
    private String expertise;
}
