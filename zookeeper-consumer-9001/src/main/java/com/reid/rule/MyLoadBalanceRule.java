package com.reid.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@Configuration
public class MyLoadBalanceRule {
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }
}

