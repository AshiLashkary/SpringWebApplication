package com.java.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebApplication {

	@GetMapping
	public String getTest()
	{
		return "HI Ashi, Welcome to App";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
