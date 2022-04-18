package com.capgemini.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketbookingApplication.class, args);
		System.out.println("Server Started");
	}

}
