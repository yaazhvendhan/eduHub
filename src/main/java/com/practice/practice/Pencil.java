package com.practice.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer{
    public void write(){
        System.out.println("Using Pencil...!");
    }
}
