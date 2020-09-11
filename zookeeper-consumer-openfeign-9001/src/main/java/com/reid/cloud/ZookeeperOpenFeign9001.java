package com.reid.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZookeeperOpenFeign9001 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOpenFeign9001.class);
    }
}
