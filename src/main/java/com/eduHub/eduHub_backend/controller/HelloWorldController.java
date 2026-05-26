package com.eduHub.eduHub_backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final Environment environment;
    @Value("${spring.application.name}")
    private String appName;

    public HelloWorldController(Environment environment){
        this.environment = environment;
    }

    //to print hello world message
    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //to print the env variables
    @GetMapping("/env")
    public String getEnvironmentVariables(){
        String port = environment.getProperty("server.port");
        // int port = context.getWebServer().getPort();  --> this returns the actual running port
        return "App Name : " + appName + ", Port : "+ port;
    }
}
