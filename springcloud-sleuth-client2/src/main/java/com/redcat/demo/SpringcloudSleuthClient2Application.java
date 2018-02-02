package com.redcat.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@SpringBootApplication
@RestController
public class SpringcloudSleuthClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSleuthClient2Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/sleuth")
	public String sleuth() {
		return restTemplate.getForObject("http://localhost:5288/index", String.class);
	}

	@RequestMapping("/index")
	public String index() {
		return new Date() + "from sleuth2";
	}

}
