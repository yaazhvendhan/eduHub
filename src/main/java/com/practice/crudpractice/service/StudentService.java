package com.practice.crudpractice.service;

import com.practice.crudpractice.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> studentList = Arrays.asList(new Student(1,"Yaazh","SpringBoot"),
            new Student(2,"Saturn","C++"),
            new Student(3,"Snow","Python")) ;
    public List<Student> getAllStudent() {

        return null;
    }
}
