package com.ajay.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		System.out.println("App started");
		SpringApplication.run(TaskApplication.class, args);
		
	}

}
