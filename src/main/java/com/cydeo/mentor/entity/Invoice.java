package com.cydeo.mentor.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    private LocalDate invoiceDate;

    private Client client;
}
