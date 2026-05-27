package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.exceptions.ResourceNotFoundException;
import com.eduHub.eduHub_backend.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> studentList = new ArrayList<>();
    public StudentController(){
        studentList.add(new Student(1,"Yaazh","12345"));
        studentList.add(new Student(2,"Saturn","54321"));
        studentList.add(new Student(3,"JSnow","11111"));
        studentList.add(new Student(4,"Stark","22222"));
        studentList.add(new Student(5,"Khalese","33333"));
    }


    // Returns one Student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1,"Yaazh","12345");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Returns list of Students
    @GetMapping("students")
    public ResponseEntity<List<Student> >getStudents(){
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    // Get Student details using https://localhost:8080/id/firstName/lastName
    @GetMapping("student/{studentId}/{studentName}/{studentPassword}")
    public ResponseEntity<Student> studentServicePathVariable(@PathVariable("studentId") int studentId,
                                                              @PathVariable("studentName") String studentName,
                                                              @PathVariable("studentPassword")String studentPassword)
            {
        Student student2 = new Student(studentId, studentName,studentPassword);
        return new ResponseEntity<>(student2,HttpStatus.OK);
    }

    // Get Student details using http://localhost:8080/query?id=studentId&firstName=firstName&lastName=lastName
    @GetMapping("query")
    public ResponseEntity<Student> studentServiceResponseVariable(@RequestParam int studentId,
                                                                  @RequestParam String studentName,
                                                                  @RequestParam String studentPassword)
    {
        Student student3 = new Student(studentId,studentName,studentPassword);
        return ResponseEntity.ok(student3);
    }

    // Create a new Student
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getStudentId());
        System.out.print(student.getStudentName());
        System.out.println(student.getStudentPassword());
        return ResponseEntity.ok(student);
    }

    // Update Student
    @PutMapping("update/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable int studentId, @RequestBody Student updateStudent) {
        Student student = studentList.stream().filter( s -> s.getStudentId()==studentId)
                .findFirst()
                .orElseThrow(()-> new ResourceNotFoundException("Student","StudentId",String.valueOf(studentId)));
        student.setStudentName(updateStudent.getStudentName());
        student.setStudentPassword(updateStudent.getStudentPassword());
        return ResponseEntity.ok(student);
    }

    // Update based on id
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudents(@PathVariable("id") int studentId,
                                         @RequestBody Student student5)
    {
//        return ResponseEntity.accepted().body(student5);  .accepted() is for future processing like async operations and not for immediate operations.
        return ResponseEntity.ok().body(student5);
    }

    // Delete Student
    @DeleteMapping("{studentId}/delete")
    public ResponseEntity<String > deleteStudent(@PathVariable("studentId") int studentId)
    {
        return ResponseEntity.accepted().body("Data deleted successfully");
    }
}
