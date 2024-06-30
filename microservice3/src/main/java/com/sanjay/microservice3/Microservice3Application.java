package com.sanjay.microservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class Microservice3Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice3Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}
}
