package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/user/login")
    @ResponseBody
    public String login(){
        return "用户登录 /user/login";
    }


    @RequestMapping("/user/account")
    @ResponseBody
    public String account(){
        return "查询用户的账户，需要登录 /user/account";
    }
}
