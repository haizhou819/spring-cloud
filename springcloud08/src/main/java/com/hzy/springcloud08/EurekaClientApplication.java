package com.hzy.springcloud08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
* @ClassName:EurekaClientApplication 
* @Description:创建Eureka Client 
* @author:hzyuan@iflytek.com 
* @date:2019年6月6日
*
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
	public static void main(String[] args) {
         SpringApplication.run(EurekaClientApplication.class, args);
     }
 
     @Value("${server.port}")
     String port;
     @RequestMapping("/")
     public String home() {
         return "hello world from port " + port;
     }
}
