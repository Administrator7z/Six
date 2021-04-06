package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFilterController {


    @RequestMapping("/student/login")
    @ResponseBody
    public String login(){
        return "/student/login";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String account(){
        return "/user/account";
    }
}
