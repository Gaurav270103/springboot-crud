package com.cjc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		System.out.println("this is springboot app");
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
