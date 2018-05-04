package com.example.test.springboot_demo.dto;

/**
 * @author li.zhao@hand-china.com
 * @version 1.0
 * @name dto
 * @description com.example.test.springboot_demo.dto
 * @date 2018/4/27
 */
public class User {
    private String name;
    private Integer age;

    public User(){

    }
    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
