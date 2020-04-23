package com.example.springmysqldatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@Autowired
	UserRespository userRepository;
	
	@GetMapping("/greeting")
	public void greeting() {
		System.out.println("greeting");;
	}
}