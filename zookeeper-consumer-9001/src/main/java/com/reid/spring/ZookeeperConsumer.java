package com.reid.spring;

import com.reid.rule.MyLoadBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "zookeeper-provider", configuration = MyLoadBalanceRule.class)
public class ZookeeperConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConsumer.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
