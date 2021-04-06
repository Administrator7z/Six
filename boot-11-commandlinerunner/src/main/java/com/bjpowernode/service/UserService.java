package com.bjpowernode.service;

import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserService {

    public void getUser(){
        System.out.println("这是userService");
    }
}
