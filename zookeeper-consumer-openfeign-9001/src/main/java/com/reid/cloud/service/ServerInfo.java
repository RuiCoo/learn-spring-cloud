package com.reid.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Reid
 * @Date 2020/9/10
 */
@FeignClient(value = "zookeeper-provider")
public interface ServerInfo {
    @GetMapping(value = "/server/info")
    String serverInfo();
}
