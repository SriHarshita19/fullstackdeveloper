package com.cts.training.initialpublicofferingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class InitialpublicofferingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialpublicofferingServiceApplication.class, args);
	}

}
