package com.hzy.springcloud09.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
 * 
* @ClassName:HelloService 
* @Description:
* @HystrixCommand注解定义了一个断路器，它封装了getHelloContant()方法， 
* 当它访问的SERVICE-HELLOWORLD失败达到阀值后，将不会再调用SERVICE-HELLOWORLD，
*  取而代之的是返回由fallbackMethod定义的方法serviceFailure（）
*  注意两点：
*  （1）fallbackMethod的返回值和参数类型需要和被@HystrixCommand注解的方法完全一致，否则会在运行时抛出异常，
*  比如本例中，serviceFailure（）的返回值和getHelloContant()方法的返回值都是String
*  （2）当底层服务失败后，fallbackMethod替换的不是整个被@HystrixCommand注解的方法（本例中的getHelloContant), 
*  替换的只是通过restTemplate去访问的具体服务。可以从中的system输出看到， 即使失败，控制台输出里面依然会有“call SERVICE-HELLOWORLD”。
* @author:hzyuan@iflytek.com 
* @date:2019年6月10日
*
 */
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "serviceFailure")
	public String getHelloContent() {
		return restTemplate.getForObject("http://SERVICE-HELLOWORLD/", String.class);
	}

	public String serviceFailure() {
		return "hello world service is not available !";
	}
}
