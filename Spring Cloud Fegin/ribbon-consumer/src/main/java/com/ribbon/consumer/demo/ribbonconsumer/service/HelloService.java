package com.ribbon.consumer.demo.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name HelloService
 * @description com.ribbon.consumer.demo.ribbonconsumer.service
 * @date 2018/4/16
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}
