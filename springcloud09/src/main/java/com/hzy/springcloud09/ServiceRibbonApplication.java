package com.hzy.springcloud09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
* @ClassName:ServiceRibbonApplication 
* @Description:创建一个ribbon服务且添加断路器 
* @author:hzyuan@iflytek.com 
* @date:2019年6月6日
*
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ServiceRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}
	
     @Bean
     @LoadBalanced
     RestTemplate restTemplate() {
         return new RestTemplate();
     }
}
