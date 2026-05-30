package com.practice.apipractice.controller;

import com.practice.apipractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add-student")
    public String addStudent(@RequestBody String name){
        studentService.setName(name);
        return studentService.addStudent();
    }
}
