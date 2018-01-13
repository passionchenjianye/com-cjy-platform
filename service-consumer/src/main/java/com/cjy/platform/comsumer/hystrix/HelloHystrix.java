package com.cjy.platform.comsumer.hystrix;

import com.cjy.platform.comsumer.facade.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * <p>熔断器测试</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 17:19
 */
@Component
public class HelloHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello " +name+", this message send failed ";
    }
}
