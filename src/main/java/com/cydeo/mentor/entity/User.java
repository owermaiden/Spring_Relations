package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class User extends BaseEntity{

    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private Role role;

}
