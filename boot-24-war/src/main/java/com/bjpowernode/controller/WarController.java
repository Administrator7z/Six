package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WarController {

    @RequestMapping("/toindex")
    public String invokeJsp(Model model){
        model.addAttribute("data","张三同学");
        return "index";
    }
}
