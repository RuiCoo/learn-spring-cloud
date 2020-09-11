package com.reid.cloud.controller;

import com.reid.cloud.service.ServerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@RestController
public class Consumer {

    @Autowired
    private ServerInfo serverInfo;

    @GetMapping(value = "/consumer/server/info")
    public String consumer(){
        return serverInfo.serverInfo();
    }
}
