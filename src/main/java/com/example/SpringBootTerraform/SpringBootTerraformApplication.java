package com.example.SpringBootTerraform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@SpringBootApplication
public class SpringBootTerraformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTerraformApplication.class, args);
	}
		

}
