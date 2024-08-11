package com.example.demo.ws.endpoints.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndPoint {

	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/other")
	public String other() {
		return "other is working!";
	}
}
