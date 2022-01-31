package com.fullstack.todo.todoappfullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.todo.todoappfullstack.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

	@GetMapping(value="/test")
	public String hello() {
		return "Hello User";
	}
	
	@GetMapping(path="/hello/{name}")
	public HelloWorldBean helloworld(@PathVariable String name) {
		return new HelloWorldBean("Welcome "+name);
	}
}
