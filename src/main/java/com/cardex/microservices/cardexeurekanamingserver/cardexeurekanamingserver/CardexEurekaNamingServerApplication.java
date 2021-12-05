package com.cardex.microservices.cardexeurekanamingserver.cardexeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CardexEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardexEurekaNamingServerApplication.class, args);
    }

}
