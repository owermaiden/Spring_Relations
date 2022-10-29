package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Data
public class Address {

    @Id
    private Long id;
    private String description;
    private String zipCode;
//    private State state;
}
