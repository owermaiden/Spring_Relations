package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_product")
@Data
public class Invoice_Product extends BaseEntity{

//    private Invoice invoice;
//    private Product product;

    private int quantity;
    private double profit;
}
