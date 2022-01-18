package com.yida.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController 加了Rest后返回前端的是字符串 要不就被thmeleaf解析
public class IndexController  {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
