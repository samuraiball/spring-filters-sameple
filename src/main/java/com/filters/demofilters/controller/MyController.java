package com.filters.demofilters.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping
    public void doNothing(){
    }

    @GetMapping("/myController" )
    public String  myController(){
        System.out.println("myController");
        return "hello filters";
    }

    @GetMapping("/throwEx")
    public void throwExController(){
        System.out.println("Throw Exception Controller");
        throw new RuntimeException();
    }
}
