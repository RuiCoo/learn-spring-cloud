package com.reid.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Reid
 * @Date 2020/9/11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Hystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix8001.class);
    }
}
