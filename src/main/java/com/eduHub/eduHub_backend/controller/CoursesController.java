package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {
    public List<Course> courseList = new ArrayList<>();

    // Constructor to initialize data
    public CoursesController() {
        courseList.add(new Course(1,"Java",2));
        courseList.add(new Course(2,"C++",2));
        courseList.add(new Course(3,"Python",2));
        courseList.add(new Course(4,"DBMS",1));
        courseList.add(new Course(5,"ML",1));
    }

    // Return one Course
    @GetMapping("courses")
    public ResponseEntity<Course> getCourses(){
        Course course  = new Course(1,"Java",2);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    // Return list of Courses
    @GetMapping("course-list")
    public ResponseEntity<List<Course>> getCourseList(){
               return new ResponseEntity<>(courseList,HttpStatus.OK);
    }

    // Get using Id
    @GetMapping("get-coursecode")
    public ResponseEntity<Course> getCourse(){
        return ResponseEntity.ok(courseList.get(0));
    }

    @GetMapping("course-query")
    public ResponseEntity<Course> CourseResponseVariable(@RequestParam int courseCode,
                                                                         @RequestParam String subjectName,
                                                                         @RequestParam int courseCredits)
    {
        Course course = new Course(courseCode, subjectName,courseCredits);
        return ResponseEntity.ok(course);
    }

//    // Get using CourseCode using String
//    @GetMapping("/get-coursecode/{courseCode}")
//    public ResponseEntity<Course> getCourse(@PathVariable String courseCode){
//        return courseList.stream().filter( c->c.getCourseCode().equalsIgnoreCase(courseCode)).findFirst().map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }


    // Getting as Query with search/get-course
//    @GetMapping("/search/get-course")
//    public ResponseEntity<Course> searchCourse(@RequestParam String courseCode){
//   return courseList.stream().filter( c->c.getCourseCode().equalsIgnoreCase(courseCode)).findFirst().map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//   }


    // Create a new Student
    @PostMapping("create-course")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        System.out.println(course.getCourseCode());
        System.out.print(course.getSubjectName());
        System.out.println(course.getCourseCredits());
        return ResponseEntity.ok(course);
    }

    // Update based on id
    @PutMapping("{courseCode}/update-course")
    public ResponseEntity<Course> updateCourse(@PathVariable("courseCode") int courseCode,
                                         @RequestBody Course course)
    {
        return ResponseEntity.accepted().body(course);
    }


    // Delete Student
    @DeleteMapping("{courseCode}/delete-course")
    public ResponseEntity deleteCourse(@PathVariable("courseCode") int courseCode){
        return ResponseEntity.accepted().body("Data deleted successfully");
    }

}
