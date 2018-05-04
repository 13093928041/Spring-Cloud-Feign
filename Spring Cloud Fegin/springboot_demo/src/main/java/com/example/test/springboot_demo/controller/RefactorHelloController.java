package com.example.test.springboot_demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.IHelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name RefactorHelloController
 * @description com.example.demo.controller
 * @date 2018/4/27
 */
@RestController
public class RefactorHelloController implements IHelloService {


    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello"+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello"+user.getName()+","+user.getAge();
    }
}
