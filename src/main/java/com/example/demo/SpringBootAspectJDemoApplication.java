package com.example.demo;

import com.example.demo.annotation.Timed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAspectJDemoApplication {

	@Timed
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAspectJDemoApplication.class, args);
	}

}
