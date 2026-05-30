package com.practice.apipractice.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String addStudent(){
        return this.name;
    }
}
