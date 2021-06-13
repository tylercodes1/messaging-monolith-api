package com.monolith.messaging.services.monolith.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("hello")
public class HelloController {
    @GetMapping("")
    public String hello() {
        System.out.println("This is hello");
        return "Hello, Monolith";
    }
}
