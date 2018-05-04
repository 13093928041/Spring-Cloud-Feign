package com.feignconsumer.demo.feign;

import com.feignconsumer.demo.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name IHelloService
 * @description com.feignconsumer.demo.service
 * @date 2018/4/26
 */
@FeignClient("HELLO-SERVICE")
public interface IHelloService {
    @RequestMapping("/hello")
    String hello();
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
