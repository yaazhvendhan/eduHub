package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.component.StudentService;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public ResponseEntity<StudentService> getStudent(){
        StudentService studentService = new StudentService(1,"Yaazh","M");
        return new ResponseEntity<>(studentService, HttpStatus.OK);
    }

    @GetMapping("students")
    public ResponseEntity<List<StudentService> >getStudents(){
        List<StudentService> studentServiceList = new ArrayList<>();
        studentServiceList.add(new StudentService(1,"Yaazh","M"));
        studentServiceList.add(new StudentService(2,"Saturn","Ring"));
        studentServiceList.add(new StudentService(3,"String","Ray"));
        studentServiceList.add(new StudentService(4,"John","Snow"));

        return new ResponseEntity<>(studentServiceList,HttpStatus.OK);
    }
}
