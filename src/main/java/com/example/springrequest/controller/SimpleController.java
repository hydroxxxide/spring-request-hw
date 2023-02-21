package com.example.springrequest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class SimpleController {

    @GetMapping("/hello")
    String printHelloWorld(){
        return "Hello world";
    }

    @PostMapping("/hello/name")
    String printHelloName(@RequestBody String name){
        return "Hello " + name;
    }


    @GetMapping("/hello/page")
    public String page(){
        return "page";
    }
}
