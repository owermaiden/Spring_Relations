package com.cydeo.mentor.entity;

import lombok.Data;

@Data
public class Invoice_Product extends BaseEntity{

    private Invoice invoice;
    private Product product;

    private int quantity;
    private double profit;
}
