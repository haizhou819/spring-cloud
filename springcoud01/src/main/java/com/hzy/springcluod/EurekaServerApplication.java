package com.hzy.springcluod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
* @ClassName:EurekaServerApplication 
* @Description:创建Eureka Server 
* @author:hzyuan@iflytek.com 
* @date:2019年6月6日
*
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
     public static void main(String[] args) {
         SpringApplication.run(EurekaServerApplication.class, args);
     }
}
