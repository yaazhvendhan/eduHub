package com.practice.apipractice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting(){
        return  "Hi this is Yaazhvendhan";
    }

    public  String about(){
        return "This is a Spring Boot Application";
    }

    public String metaData(){
        return "This is built with JDK 21 and JAVA 4.6 version";
    }

}
