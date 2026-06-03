package com.practice.databasepractice.exception;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidation(  // String is used so that Output message can be printed
            MethodArgumentNotValidException ex) {  // --->Exception is a class and obj is created for each exception

        Map<String, String> errors = new HashMap<>(); // Pair is to store field and message

        // Bind the result
        ex.getBindingResult()
                // Get the fields and look for the error
                .getFieldErrors()
                // Loop and store the error field and the message in map pair
                .forEach(error ->
                        errors.put(
                                error.getField(),
                                error.getDefaultMessage()
                        ));

        return errors;
    }
}