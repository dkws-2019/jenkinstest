package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "jenkins 测试成功";
    }
}
