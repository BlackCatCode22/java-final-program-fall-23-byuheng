/* Let’s start with the main class, RestAPI application. This class serves as the starting point
for the Spring Boot application, and it's a crucial element in the overall structure. */

// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI;

/* Importing necessary classes from the Spring Boot framework are essential components for
initializing and running Spring Boot application. */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* I've annotated SpringBootApplication to indicate that this is the main class. It informs
Spring Boot about the primary configuration class and triggers the automatic configuration. */
@SpringBootApplication
public class RestApiApplication {


	public static void main(String[] args) {


		/* SpringApplication.run is the main method that has two arguments the main class and command-line
		arguments. It initializes and starts the Spring Boot application, scans for components, sets up
		configurations, and starts the embedded server. */

		SpringApplication.run(RestApiApplication.class, args);

	}

}
