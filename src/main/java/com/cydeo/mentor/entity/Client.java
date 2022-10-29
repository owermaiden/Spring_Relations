package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class Client extends BaseEntity {

    private String companyName;
    private String phone;
    private String email;

    private Address address;
}
