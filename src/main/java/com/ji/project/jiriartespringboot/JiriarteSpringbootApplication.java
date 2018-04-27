package com.ji.project.jiriartespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class JiriarteSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(JiriarteSpringbootApplication.class, args);
	}
}
