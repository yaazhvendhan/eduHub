package com.practice.databasepractice.controller;

import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{roll}")
    public Student getStudentByRoll(@PathVariable("roll") int roll){
        return studentService.getStudentByRoll(roll);
    }

    @PostMapping("/student/add-student/{roll}")
    public Student addStudentByRoll(@PathVariable("roll")int roll, @RequestBody Student std){
        return studentService.addStudentByRoll(roll,std);
    }

    @PutMapping("/student/update-student/{roll}")
    public Student updateStudentByRoll(@PathVariable("roll")int roll, @RequestBody Student std){
        return studentService.updateStudentByRoll(roll,std);
    }

    @DeleteMapping("/student/delete/{roll}")
    public String deleteStudentByRoll(@PathVariable("roll") int roll){
        return studentService.deleteStudentByRoll(roll);
    }
}
