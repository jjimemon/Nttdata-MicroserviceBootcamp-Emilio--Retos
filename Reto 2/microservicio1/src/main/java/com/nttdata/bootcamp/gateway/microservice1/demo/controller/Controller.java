package com.nttdata.bootcamp.gateway.microservice1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(path="/microservicio1")
	public String helloWorld() {
		return "Hello, I am microservice1";
	}
	
}
