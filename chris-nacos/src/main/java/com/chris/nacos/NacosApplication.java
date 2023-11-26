package com.chris.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(NacosApplication.class, args);
    }
}
