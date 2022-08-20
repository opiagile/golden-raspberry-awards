package com.texo.app.api.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppApiMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApiMoviesApplication.class, args);
	}

}
