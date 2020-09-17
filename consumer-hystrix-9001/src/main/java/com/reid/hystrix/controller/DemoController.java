package com.reid.hystrix.controller;

import com.reid.hystrix.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reid
 * @Date 2020/9/11
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/consumer/common/server")
    public String common() {
        return demoService.commonServer();
    }

    @GetMapping("/consumer/slow/server")
    public String slow() {
        return demoService.slowServer();
    }

    @GetMapping("/consumer/server/id/{id}")
    public String testHystrix(@PathVariable(name = "id") Integer id) {
        return demoService.getId(id);
    }
}
