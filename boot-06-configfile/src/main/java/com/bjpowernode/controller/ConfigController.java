package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigController {

    @RequestMapping("/config")
    @ResponseBody
    public String helloBoot(){
        return "学习Spring Boot的核心配置文件";
    }
}
