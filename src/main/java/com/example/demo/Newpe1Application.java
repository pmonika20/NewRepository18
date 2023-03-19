package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Newpe1Application {

		@GetMapping("/Message")
	public String message() {
		return "Gullaa dekho website ban agayi, Sahi Batao Gulli";
	}

	public static void main(String[] args) {
		SpringApplication.run(Newpe1Application.class, args);
		System.out.println("completed");
	}




}
