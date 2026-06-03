package com.practice.databasepractice.controller;

import com.practice.databasepractice.Dto.StudentDto;
import com.practice.databasepractice.model.Student;
import com.practice.databasepractice.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
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

//    @GetMapping("/student/{roll}")
//    public Student getStudentByRoll(@PathVariable("roll") int roll){
//        return studentService.getStudentByRoll(roll);
//    }

    @PostMapping("/student/add-student")
    public String addStudentByRoll(@Valid @RequestBody Student std){   //Criteria for @Valid is written in Entity
        studentService.addStudentByRoll(std);
        return "Student Added Successfully";
    }

    @PutMapping("/student/update-student/{roll}")
    public Student updateStudentByRoll(@PathVariable("roll")int roll, @RequestBody Student std){
        return studentService.updateStudentByRoll(roll,std);
    }


    @DeleteMapping("/student/delete-all")
    public String deleteAllStudents(){
        return studentService.deleteAllStudents();
    }

    @DeleteMapping("/student/delete/{roll}")
    public String deleteStudentByRoll(@PathVariable("roll") int roll){
        return studentService.deleteStudentByRoll(roll);
    }

    //Custom Functions
    @GetMapping("/student/custom")
    public List<Student> getCustomStudent(@Param("gender") String gender,@Param("tech")String tech){
        return studentService.getCustomStudent(gender,tech);
    }

    @GetMapping("/student/custom/{tech}")
    public List<Student> getStudentByTech(@PathVariable String tech){
        return studentService.getStudentByTech(tech);
    }

    // Custom Queries
    @PostMapping("/student/filter")
    public List<Student> getStudentByGenderAndTech(@Param("gender") String gender,@Param("tech")String tech) {
        return studentService.getStudentByGenderAndTech(gender, tech);
    }
        @PostMapping("student/name")
        public List<Student> getStudentByStudentName(@Param("name") String name){
            return studentService.getStudentByName(name);

        }

        @GetMapping("student/{roll}")
        public StudentDto getStudentByRollDto(@PathVariable int roll){
        return studentService.getStudentByRollDto(roll);
        }

        @PostMapping("student/add")
    public StudentDto addStudentByDto( @Valid @RequestBody StudentDto student){
        return studentService.addStudentByDto(student);
        }

        @GetMapping("students/page")
    public Page<Student> getAllStudentsAsPage(@RequestParam("page")int page,
                                              @RequestParam("size") int size){
        return studentService.getAllStudentsAsPage(page,size);
        }

}



