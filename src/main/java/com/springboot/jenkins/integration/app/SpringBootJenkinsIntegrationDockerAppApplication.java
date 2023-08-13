package com.springboot.jenkins.integration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsIntegrationDockerAppApplication {

	@GetMapping("/message")
	public String getMessage() {
		
		return "Welcome to Jenkins Docker Integration";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsIntegrationDockerAppApplication.class, args);
	}

}
