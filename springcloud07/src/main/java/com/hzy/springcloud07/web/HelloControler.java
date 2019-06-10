package com.hzy.springcloud07.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.springcloud07.service.HelloService;

@RestController
public class HelloControler {
	@Autowired HelloService helloService;
    @RequestMapping(value = "/")
    public String hello(){
        return helloService.getHelloContent();
    }
}
