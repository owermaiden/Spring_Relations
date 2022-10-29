package com.cydeo.mentor.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

@Data
public class Product extends BaseEntity {

    private String name;
    private Category category;
    private double price;
}
