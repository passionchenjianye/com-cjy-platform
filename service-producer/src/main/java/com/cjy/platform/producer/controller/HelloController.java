package com.cjy.platform.producer.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <p>测试控制器</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 13:59
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + ", this is first message";
    }
}
