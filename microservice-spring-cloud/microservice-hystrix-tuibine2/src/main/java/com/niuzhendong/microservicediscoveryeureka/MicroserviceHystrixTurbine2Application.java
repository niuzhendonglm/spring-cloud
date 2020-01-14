package com.niuzhendong.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class MicroserviceHystrixTurbine2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHystrixTurbine2Application.class, args);
    }

}