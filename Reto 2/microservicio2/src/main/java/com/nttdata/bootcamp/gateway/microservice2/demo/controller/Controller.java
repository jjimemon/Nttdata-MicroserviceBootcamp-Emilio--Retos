package com.nttdata.bootcamp.gateway.microservice2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(path="/microservicio2")
	public String helloWorld() {
		return "Hello, I am microservice2";
	}
	
}
