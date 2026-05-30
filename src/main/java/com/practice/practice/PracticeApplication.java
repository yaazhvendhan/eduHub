package com.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class PracticeApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(PracticeApplication.class, args);
        Student s1= context.getBean(Student.class);
        s1.age = 19;
        s1.study();
        Student s2 = context.getBean(Student.class);

        System.out.println("age of s1 "+  s1.age +" age of s2 " + s2.age);
    }

}
