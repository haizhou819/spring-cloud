package com.hzy.springcloud09.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.springcloud09.service.HelloService;

@RestController
public class HelloControler {
	@Autowired HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hello(){
        return helloService.getHelloContent();
    }
}
