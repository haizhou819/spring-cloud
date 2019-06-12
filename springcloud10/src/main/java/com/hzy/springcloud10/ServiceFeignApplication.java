package com.hzy.springcloud10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * 
* @ClassName:ServiceFeignApplication 
* @Description:用声明式REST客户端Feign调用远端HTTP服务
* @author:hzyuan@iflytek.com 
* @date:2019年6月10日
*
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {
     public static void main(String[] args) {
         SpringApplication.run(ServiceFeignApplication.class, args);
     }
}
