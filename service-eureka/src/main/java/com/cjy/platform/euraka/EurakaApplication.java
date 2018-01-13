package com.cjy.platform.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>服务注册中心启动类</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 13:58
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaApplication.class, args);
	}
}
