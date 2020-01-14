package com.niuzhendong.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaHighAvailabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaHighAvailabilityApplication.class, args);
    }

}