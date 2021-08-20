package com.fc.controller;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Value("${server.port}")
    String port;

    @RequestMapping("add")
    @SentinelResource(value = "add", blockHandler = "object")
    public String add() {
        return port + "添加学生成功";
    }

    @SentinelResource(value = "find/{id}",blockHandler = "find")
    @GetMapping("find/{id}")
    public String Find(@PathVariable Integer id) {
        return "查询成功";
    }

    public String find(@PathVariable Integer id,BlockException e) {
        return "find流控";
    }

    public String object(BlockException e) {
        return "add流控";
    }
}
