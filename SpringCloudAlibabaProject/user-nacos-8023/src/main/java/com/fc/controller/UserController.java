package com.fc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Value("${server.port}")
    String port;

    @RequestMapping("add")
    public String add() {
        return port + "添加学生成功！";
    }
}
