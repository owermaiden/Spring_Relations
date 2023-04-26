package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product extends BaseEntity {

    private String name;
    private double price;

/*  These fields will be used in STEP-3
    private Category category;

 */
}
