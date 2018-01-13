package com.cjy.platform.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Ribbon服务类</p>
 *
 * @author: 陈建业
 * @date: 2018-01-13 19:54
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String helloRibbon(String name) {
        return restTemplate.getForObject("http://spring-cloud-system/system/info", String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}