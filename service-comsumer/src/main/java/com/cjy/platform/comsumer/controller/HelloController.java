package com.cjy.platform.comsumer.controller;

import com.cjy.platform.comsumer.facade.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>客户端测试控制器</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 16:37
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
