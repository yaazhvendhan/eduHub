package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.component.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student")
    public ResponseEntity<StudentService> getStudent(){
        StudentService studentService = new StudentService(1,"Yaazh","M");
        return new ResponseEntity<>(studentService, HttpStatus.OK);
    }
}
