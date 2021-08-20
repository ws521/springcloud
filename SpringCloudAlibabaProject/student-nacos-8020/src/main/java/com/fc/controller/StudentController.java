package com.fc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("add")
    public String add(){
        System.out.println(restTemplate);
        String mess = restTemplate.getForObject("http://user-nacos/user/add", String.class);

        return mess;
    }

}


