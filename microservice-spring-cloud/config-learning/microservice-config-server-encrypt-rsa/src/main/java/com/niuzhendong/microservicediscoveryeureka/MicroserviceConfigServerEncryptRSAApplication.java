package com.niuzhendong.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigServerEncryptRSAApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigServerEncryptRSAApplication.class, args);
    }

}