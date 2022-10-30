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

/*  These fields will be used in STEP-3
    private Invoice invoice;


    private Product product;

 */
}
