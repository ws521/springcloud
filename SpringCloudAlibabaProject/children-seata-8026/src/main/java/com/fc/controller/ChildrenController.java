package com.fc.controller;

import com.fc.dao.ChildrenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("children")
public class ChildrenController {

    @Autowired
    ChildrenDao childrenDao;

    @RequestMapping("add")
    public String add(){
        childrenDao.add();
        return "成功";
    }
}
