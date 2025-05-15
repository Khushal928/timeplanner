package com.example.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trail {

    static class NameRequest {
        public String name;
    }

    @PostMapping("/hello")
    public String greetUser(@RequestBody NameRequest request) {
        return "Hello, " + request.name + "!";
    }
}
