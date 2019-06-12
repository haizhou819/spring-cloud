package com.hzy.springcloud10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.springcloud10.service.HelloWorldService;
@RestController
public class WebController {
     @Autowired HelloWorldService helloWorldFeignService;
     @RequestMapping(value = "/hello",method = RequestMethod.GET)
     public String sayHello(){
         return helloWorldFeignService.sayHello();
     }
}
