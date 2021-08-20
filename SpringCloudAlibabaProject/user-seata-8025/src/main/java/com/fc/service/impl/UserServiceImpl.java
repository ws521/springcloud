package com.fc.service.impl;

import com.fc.dao.UserDao;
import com.fc.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    UserDao userDao;

    @GlobalTransactional
    @Override
    public void add() {
        userDao.add();
        String mess = restTemplate.getForObject("http://children-nacos/children/add", String.class);
        System.out.println(mess);
        int a = 1/0;
    }
}
