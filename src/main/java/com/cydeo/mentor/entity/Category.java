package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.*;


@Data
public class Category {


    private Long id;
    private String categoryName;
    private int tax;

}
