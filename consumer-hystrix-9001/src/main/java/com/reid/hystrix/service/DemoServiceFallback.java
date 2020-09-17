package com.reid.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * @author Reid
 * @Date 2020/9/14
 */
@Component
public class DemoServiceFallback implements DemoService {
    @Override
    public String commonServer() {
        return "common server fallback";
    }

    @Override
    public String slowServer() {
        return "slow server fallback";
    }

    @Override
    public String getId(Integer id) {
        return "fallback";
    }
}
