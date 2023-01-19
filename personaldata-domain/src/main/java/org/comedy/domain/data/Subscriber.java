package org.comedy.domain.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Subscriber {
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private String birthCountry;
    private String email;
    private String biography;
    private String expertise;
}
