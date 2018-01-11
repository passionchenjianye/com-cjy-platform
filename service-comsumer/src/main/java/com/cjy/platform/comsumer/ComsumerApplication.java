package com.cjy.platform.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class ComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComsumerApplication.class, args);
	}

//	@LoadBalanced
//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
}
