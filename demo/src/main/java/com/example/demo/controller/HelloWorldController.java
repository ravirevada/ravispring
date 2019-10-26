package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private String hello;
	
	@GetMapping("/hello")
	public String helloWorld() {
		hello = "Hello World";
		return hello;
	}

}
