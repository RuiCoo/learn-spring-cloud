package com.reid.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@RestController
@Slf4j
public class ServerInfoController {

    @Value("${server.port}")
    private Integer serverPort;
    @Value(("${spring.application.name}"))
    private String serverName;

    @GetMapping(value = "/server/info")
    public String serverInfo() {
        log.info("receive request");
        return String.format("serverName: %s, serverPort: %s", serverName, serverPort);
    }
}
