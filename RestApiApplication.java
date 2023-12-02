// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI;

// Importing necessary classes from the Spring Boot framework
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation indicating that this class is the main class for a Spring Boot application
@SpringBootApplication
public class RestApiApplication {

	// Main method, the entry point for the application
	public static void main(String[] args) {
		// Initialize and start the Spring Boot application context
		// This method will scan for Spring components, set up configuration, and start the embedded server
		SpringApplication.run(RestApiApplication.class, args);
	}

}
