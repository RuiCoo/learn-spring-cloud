package com.reid.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Reid
 * @Date 2020/9/14
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9002 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard9002.class);
    }
}
