package com.cjy.platform.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>服务提供者启动类</p>
 *
 * @author: 陈建业
 * @date: 2018-01-11 13:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
