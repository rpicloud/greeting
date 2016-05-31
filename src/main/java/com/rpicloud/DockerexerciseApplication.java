package com.rpicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerexerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerexerciseApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "Hello Docker World";
	}
}
