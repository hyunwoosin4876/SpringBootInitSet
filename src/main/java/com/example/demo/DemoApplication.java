package com.example.SpringBootInitSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.SpringBootInitSet")
@ComponentScan(basePackages = "com.example.SpringBootInitSet")
@EnableAutoConfiguration
public class SpringBootInitSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitSetApplication.class, args);
	}

}
