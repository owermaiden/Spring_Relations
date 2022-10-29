package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Data
public class Client extends BaseEntity {

    private String companyName;
    private String phone;
    private String email;

//    private Address address;
}
