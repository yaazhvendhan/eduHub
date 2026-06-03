package com.practice.databasepractice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int roll;
    @NotBlank(message = "Name filed is empty, kindly enter the name")
    private  String name;
    @NotBlank(message = "Gender field is empty, kindly enter the gender")
    private String gender;
    @NotBlank(message = "Tech filed is empty, kindly enter the tech")
    private  String tech;
    private String email;
    private String password;

}
