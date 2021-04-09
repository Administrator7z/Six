package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/toindex")
    public String index(Model model){
        model.addAttribute("data","李思同学");
        return "index";
    }
}
