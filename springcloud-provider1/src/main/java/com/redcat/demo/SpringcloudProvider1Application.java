package com.redcat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProvider1Application.class, args);
	}
}
