package com.example.firstms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstmsApplication.class, args);
	}

}
