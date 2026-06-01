package com.practice.crudpractice.controller;

import com.practice.crudpractice.model.Student;
import com.practice.crudpractice.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    StudentService studentService;
    @GetMapping("students")
    public List<Student> getAllStudent(){
                return studentService.getAllStudent();
    }
}
