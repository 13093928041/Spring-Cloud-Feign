package com.ribbon.consumer.demo.ribbonconsumer.controller;

import com.ribbon.consumer.demo.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name ConsumerController
 * @description com.ribbon.consumer.demo.ribbonconsumer.controller
 * @date 2018/3/28
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.helloService();
    }
}
