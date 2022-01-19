package com.nttdata.bootcamp.actuator.actuatorserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {

	private Counter counter;
	
	public TestController (MeterRegistry registry) {
		this.counter = Counter.builder("invocacion hello").description("invocaciones totales: ").register(registry);
	}
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		counter.increment();
		return "Hello world";
	}
	
}
