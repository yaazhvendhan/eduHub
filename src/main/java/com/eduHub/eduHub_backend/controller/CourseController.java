package com.eduHub.eduHub_backend.controller;

import com.eduHub.eduHub_backend.component.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
//  @Autowired for object creation (IOC)
    CourseService courseService;

/*   Instead of @Autowored we can go with
     CourseService courseService;
     public CourseController(CourseService courseservice){
     this.courseservice = courseservice;
     }
*/

    @GetMapping("/course")
    public String getCourse(){
        return courseService.getCourse();
    }
}
