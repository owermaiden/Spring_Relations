package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;


    private Invoice invoice;


    private Product product;
}
