package com.cjy.platform.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>系统控制器</p>
 *
 * @author: 陈建业
 * @date: 2018-01-13 19:37
 */
@RestController
@RequestMapping(value = "/system")
public class SystemController {

    @GetMapping(value = "/info")
    public String getSystemInfo() {
        return "hello I am system service";
    }
}
