package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

    @RequestMapping("/toindex")
    public String toIndex(Model model){
        System.out.println("执行了JspController的toIndex");
        //添加数据到model
        model.addAttribute("data","springboot中使用jsp，后期使用Thymeleaf代替jsp");
        //逻辑视图名称
        return "index";
    }


    @RequestMapping("/toindex1")
    public ModelAndView toIndex1(){
        ModelAndView mv  = new ModelAndView();

        System.out.println("执行了JspController的toIndex1111");
        //添加数据到model
        mv.addObject("data","springboot中使用jsp，后期使用Thymeleaf代替jsp");
        //逻辑视图名称
        mv.setViewName("index");
        return mv;
    }
}
