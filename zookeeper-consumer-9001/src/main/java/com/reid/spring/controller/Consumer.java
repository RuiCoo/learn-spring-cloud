package com.reid.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@RestController
public class Consumer {

    private static final String INVOKE_URL = "http://zookeeper-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/server/info")
    public String serverInfo(){
        return restTemplate.getForObject(INVOKE_URL + "/server/info", String.class);
    }
}
