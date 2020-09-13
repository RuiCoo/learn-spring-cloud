package com.reid.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Reid
 * @Date 2020/9/11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Hystrix9001 {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix9001.class);
    }
}
