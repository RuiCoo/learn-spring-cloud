package com.reid.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Reid
 * @Date 2020/9/11
 */

@FeignClient(value = "PROVIDER-HYSTRIX")
@Component
public interface DemoService {
    @GetMapping("server/common")
    String commonServer();

    @GetMapping("server/slow")
    String slowServer();
}
