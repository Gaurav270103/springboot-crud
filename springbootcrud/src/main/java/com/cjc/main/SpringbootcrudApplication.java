package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringbootcrudApplication {

	public static void main(String[] args) {
		System.out.println("this is springboot crud application...");
		SpringApplication.run(SpringbootcrudApplication.class, args);
	}

}
