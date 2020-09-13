package com.reid.hystrix.controller;

import com.reid.hystrix.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reid
 * @Date 2020/9/11
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/server/common")
    public String commonController() {
        return demoService.commonServer();
    }

    @GetMapping(value = "/server/slow")
    public String slowController() {
        return demoService.slowServer();
    }
}
