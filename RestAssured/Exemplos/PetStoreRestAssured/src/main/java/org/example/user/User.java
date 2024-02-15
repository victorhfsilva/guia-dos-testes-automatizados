package org.example.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

}
