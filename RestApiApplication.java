	// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI;

	/* Importing necessary classes from the Spring Boot framework are essential components for
	initializing and running Spring Boot application. */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	/* This is the main class, RestAPI application. It serves as a starting point.
	I've annotated SpringBootApplication to indicate that this is the main class.  */
@SpringBootApplication
public class RestApiApplication {


	public static void main(String[] args) {


		/* SpringApplication.run is the main method that has two arguments the main class and command-line. */
		SpringApplication.run(RestApiApplication.class, args);

	}

}
