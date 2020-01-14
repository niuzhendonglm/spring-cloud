package com.niuzhendong.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceConfigClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigClientEurekaApplication.class, args);
    }

}