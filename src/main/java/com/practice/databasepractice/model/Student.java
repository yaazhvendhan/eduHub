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
    @NotBlank
    private  String name;
    @NotBlank
    private String gender;
    @NotBlank
    private  String tech;

}
