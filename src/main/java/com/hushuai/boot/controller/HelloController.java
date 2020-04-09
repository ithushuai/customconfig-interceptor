package com.hushuai.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * created by it_hushuai
 * 2020/4/6 21:56
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sayHello")
    public String sayHello(){

        return "hello, Spring Boot";
    }

    @GetMapping("dataSource")
    public String getDataSource(){
        return "dataSource init...";
    }
}
