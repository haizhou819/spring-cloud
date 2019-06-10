package com.hzy.springcloud03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
* @ClassName:ConfigServerApplication 
* @Description:创建config Server 
* @author:hzyuan@iflytek.com 
* @date:2019年6月6日
*
 */
@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
     public static void main(String[] args) {
         SpringApplication.run(ConfigServerApplication.class, args);
     }
}
