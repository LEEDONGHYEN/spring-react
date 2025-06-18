package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World - My First Spring Boot and React Program";
    }

    @GetMapping("/api/good")
    public String good() {
        return "Hello Bye- My First Spring Boot and React Program";
    }
}