package com.practice.practice;

 import org.springframework.stereotype.Component;

@Component
public class Student {

    public int age;

    public void study(){
        System.out.println("I'm an Engineering Student");
    }

    public Student (){
        System.out.println("Object Created");
    }
}
