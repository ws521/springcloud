package com.fc.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-nacos",path = "/user")
public interface UserController {
    @RequestMapping("add")
    public String add();

    @GetMapping("find/{id}")
    String find(@PathVariable(value = "id") Integer id);
}
