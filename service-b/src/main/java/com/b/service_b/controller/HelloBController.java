package com.b.service_b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class HelloBController {
    @GetMapping("/hello")
    public  String hello(){
        return "Greeting service B";
    }
}
