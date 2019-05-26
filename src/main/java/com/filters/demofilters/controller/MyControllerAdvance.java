package com.filters.demofilters.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvance {

    @ExceptionHandler
    public String handleRuntimeException(RuntimeException e){
        System.out.println("Throw Exception ControllerAdvance");
        return "exception occurred";
    }
}
