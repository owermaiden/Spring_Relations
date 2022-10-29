package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Data
public class Address {

    private Long id;
    private String description;
    private String zipCode;

    private State state;
}
