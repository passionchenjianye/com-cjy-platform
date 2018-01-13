package com.cjy.platform.comsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>配置中心测试</p>
 *
 * @author: 陈建业
 * @date: 2018-01-12 22:11
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${name}")
    private String name;

    @GetMapping("/config/hello")
    public String hello() {
        return this.name;
    }
}
