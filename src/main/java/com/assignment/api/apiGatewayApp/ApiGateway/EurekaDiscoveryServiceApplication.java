package com.assignment.api.apiGatewayApp.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "EurekaDiscoveryService");
		SpringApplication.run(EurekaDiscoveryServiceApplication.class, args);
	}

}
