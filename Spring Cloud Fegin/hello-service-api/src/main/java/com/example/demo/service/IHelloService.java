package com.example.demo.service;

import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name IHelloService
 * @description com.example.demo.service
 * @date 2018/4/27
 */
@RequestMapping(value = "/refactor")
public interface IHelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);
    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);
    @RequestMapping(value = "/hello6",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
