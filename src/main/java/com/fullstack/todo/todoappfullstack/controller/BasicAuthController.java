package com.fullstack.todo.todoappfullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthController {

    @GetMapping("/basicauth")
    public AuthenticationBean helloAuth(){
        return new AuthenticationBean("You are authorized");
    }
}
