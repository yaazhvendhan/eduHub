package com.practice.crudpractice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //Getter and Setter
@AllArgsConstructor  // Constructor with parameters
@NoArgsConstructor  // Default constructor
public class Student {
    private int roll_no;
    private String name;
    private  String tech;

}
