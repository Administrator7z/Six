package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class QuickThymeleafController {

    @RequestMapping("/quick")
    public String quick(HttpServletRequest request,Model model){

        model.addAttribute("myname","李思在动力");
        request.setAttribute("myage",18);;
        return "demo";//视图名称，逻辑名称
    }
}
