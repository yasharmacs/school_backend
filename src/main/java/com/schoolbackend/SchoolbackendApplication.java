package com.schoolbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.schoolbackend")
public class SchoolbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolbackendApplication.class, args);
	}

}
