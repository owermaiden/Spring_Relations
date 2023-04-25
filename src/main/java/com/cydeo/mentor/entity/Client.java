package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

/*  This field will be used in STEP-3
    private Address address;

 */
}
