package com.practice.databasepractice.controller;

import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{roll}")
    public Student getStudentByRoll(@PathVariable("roll") int roll){
        return studentService.getStudentByRoll(roll);
    }
}
