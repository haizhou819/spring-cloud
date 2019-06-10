package com.hzy.springcloud04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
* @ClassName:ConfigClientApplication 
* @Description:创建config client
* @author:hzyuan@iflytek.com 
* @date:2019年6月6日
*
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
     public static void main(String[] args) {
         SpringApplication.run(ConfigClientApplication.class, args);
     }
 
     @Value("${hello}")
     String hello;
     @RequestMapping(value = "/hello")
     public String hello(){
         return hello;
     }
    
}
