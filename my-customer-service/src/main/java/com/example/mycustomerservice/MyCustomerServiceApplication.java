package com.example.mycustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCustomerServiceApplication.class, args);
    }

}
