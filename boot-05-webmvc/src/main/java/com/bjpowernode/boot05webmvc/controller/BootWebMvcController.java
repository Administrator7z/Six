package com.bjpowernode.boot05webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootWebMvcController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloBoot(){
        return "使用SpringBoot框架，快速开发";
    }
}
