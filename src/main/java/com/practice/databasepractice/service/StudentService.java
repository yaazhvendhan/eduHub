package com.practice.databasepractice.service;

import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Repo r;
    public List<Student> getAllStudents(){
        return r.findAll();
    }

    public Student getStudentByRoll(int roll) {
        return r.findById(roll).orElse(null);
    }

    public Student addStudentById(int roll, Student std) {
        return r.save(std);
    }
}
