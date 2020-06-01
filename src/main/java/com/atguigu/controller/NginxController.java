package com.atguigu.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NginxController {

    @Value("${server.port}")
    private  Integer port;

    @GetMapping("/hello")
    public String hello(){
        return port+"";
    }

}
