package com.cydeo.mentor.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product extends BaseEntity {

    private String name;
//    private Category category;
    private double price;
}
