package com.fc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    UserController userController;

    @RequestMapping("add")
    public String add(){

        return userController.add();
    }

    @GetMapping("find/{id}")
    public String find(@PathVariable(value = "id") Integer id){
        return userController.find(id);
    }
}


