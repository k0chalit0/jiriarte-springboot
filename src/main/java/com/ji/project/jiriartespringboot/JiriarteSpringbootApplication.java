package com.ji.project.jiriartespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class JiriarteSpringbootApplication {

	@RequestMapping("/")  //GET by Default
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello")
	String hello(){
		return "Hello!!";
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String getNameBySimplePathWithPathVariable(
			@PathVariable("name") String name) {
		return "Hello " + name + "!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JiriarteSpringbootApplication.class, args);
	}
}
