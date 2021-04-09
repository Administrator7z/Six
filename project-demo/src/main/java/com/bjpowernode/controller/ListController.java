package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

    //项目首页
    @RequestMapping("/index")
    public String pageList(){
        return "index";
    }

    //分页查看产品
    @RequestMapping("/pageLoan")
    public String pageLoan(){
        return "loan";
    }

    //查看单个产品
    @RequestMapping("/loanInfo")
    public String loanInfo(){
        return "loanInfo";
    }

    //登录
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //注册
    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    //用户中心
    @RequestMapping("/myCenter")
    public String myCenter(){
        return "myCenter";
    }
    //实名认证
    @RequestMapping("/realName")
    public String realName(){
        return "realName";
    }


    //充值
    @RequestMapping("/toRecharge")
    public String toRecharge(){
        return "toRecharge";
    }
}
