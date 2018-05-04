package com.feignconsumer.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name RefactorHelloServie
 * @description com.example.demo.feign
 * @date 2018/4/27
 */
@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloServie extends com.example.demo.service.IHelloService{

}
