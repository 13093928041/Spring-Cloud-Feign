package com.feignconsumer.demo.controller;

import com.feignconsumer.demo.dto.User;
import com.feignconsumer.demo.feign.IHelloService;
import com.feignconsumer.demo.feign.RefactorHelloServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name ConsumerController
 * @description com.feignconsumer.demo.controller
 * @date 2018/4/26
 */
@RestController
public class ConsumerController {

    @Autowired
    IHelloService helloService;

    @Autowired
    RefactorHelloServie refactorHelloServie;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()+"\n");
        sb.append(helloService.hello("DIDI")+"\n");
        sb.append(helloService.hello("DIDI",30)+"\n");
        sb.append(helloService.hello(new User("DIDI",30))+"\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloServie.hello("MIMI")+"\n");
        sb.append(refactorHelloServie.hello("MIMI",20)+"\n");
        sb.append(refactorHelloServie.hello(new com.example.demo.dto.User("MIMI",20))+"\n");
        return sb.toString();
    }
}
