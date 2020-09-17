package com.reid.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Reid
 * @Date 2020/9/11
 */

@FeignClient(value = "PROVIDER-HYSTRIX", fallback = DemoServiceFallback.class)
@Component
public interface DemoService {
    @GetMapping("server/common")
    String commonServer();

    @GetMapping("server/slow")
    String slowServer();

    @GetMapping(value = "/server/id/{id}")
    String getId(@PathVariable(name = "id") Integer id);
}
