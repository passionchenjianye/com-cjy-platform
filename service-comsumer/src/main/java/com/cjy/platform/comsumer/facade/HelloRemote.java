package com.cjy.platform.comsumer.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>调用远程服务</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 16:36
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
