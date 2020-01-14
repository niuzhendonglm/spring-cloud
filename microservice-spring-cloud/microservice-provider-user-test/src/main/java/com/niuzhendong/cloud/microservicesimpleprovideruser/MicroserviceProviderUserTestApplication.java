package com.niuzhendong.cloud.microservicesimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderUserTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserTestApplication.class, args);
	}
}
