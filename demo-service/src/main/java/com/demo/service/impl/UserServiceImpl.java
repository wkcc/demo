package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public Object getUser(){
        User user = userMapper.getUser();
        return user;
    }

    public void addUser(String userId, String userName, String userPassWord){
        userMapper.addUser("wang","王","123");
    }
}
