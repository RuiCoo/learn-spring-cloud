package com.reid.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Reid
 * @Date 2020/9/11
 */
@Service
@Slf4j
public class DemoService {

    public String commonServer() {
        log.info("process common request");
        return "request success";
    }

    @HystrixCommand(fallbackMethod = "slow_fallback", commandProperties ={
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")
    })
    public String slowServer() {
        log.info("process slow request");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "slow response";
    }

    public String slow_fallback() {
        return "服务器太忙了，请稍后再试";
    }
}
