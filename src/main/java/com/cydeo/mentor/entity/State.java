package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class State {


    private Long id;
    private String stateCode;
    private String stateName;
}
