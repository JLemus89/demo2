package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping ("/")
    public String saludar(){
        return "Hola Mundo, primer spring boot";
    }

    @GetMapping ("/about")
    public String about(){
        return "a cerca de Spring Boot";
    }
}
