package com.cjy.platform.controller;

import com.cjy.platform.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Ribbon控制器</p>
 *
 * @author: 陈建业
 * @date: 2018-01-13 19:57
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/ribbon/{name}")
    public String helloRibbon(@PathVariable String name) {
        return this.ribbonService.helloRibbon(name);
    }
}
