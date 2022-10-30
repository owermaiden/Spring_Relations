package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String zipCode;

    /*  These fields will be used in STEP-3
    private State state;

     */
}
