package com.practice.crudpractice.controller;

import com.practice.crudpractice.model.Student;
import com.practice.crudpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public List<Student> getAllStudent(){
                return studentService.getAllStudent();
    }
    @GetMapping("students/{roll_no}")
    public Student getStudentByRollNo(@PathVariable("roll_no") int roll_no){  //@PathVariable --> Says that the variable is dynamic . ie tin he path students/roll_no the roll number can change
        return studentService.getStudentByRollNo(roll_no);
    }

    @PostMapping("student")
    public String addStudent(@RequestBody Student std){
        studentService.addStudent(std);
        return "Success";
    }

    @PutMapping("student/{roll_no}")
    public String updateStudent(@PathVariable("roll_no") int roll, @RequestBody Student updatestudent){
        studentService.updateStudent(roll,updatestudent);
        return "Updated Successfully";
    }

}
