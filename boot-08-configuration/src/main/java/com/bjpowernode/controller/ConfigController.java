package com.bjpowernode.controller;

import com.bjpowernode.config.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ConfigController {

    @Value("${school.name}")
    private String name;
    @Value("${school.site}")
    private String site;
    @Value("${school.address}")
    private String address;

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    //注入对象
    @Resource
    private SchoolInfo schoolInfo;


    @RequestMapping("/config")
    @ResponseBody
    public String getConfigData(){
        return "学校："+name+", 网站："+site+"地址："+ address
                +"<br/>"+"端口："+port+",访问路径："+contextPath;
    }

    @RequestMapping("/getSchool")
    @ResponseBody
    public String getSchool(){
        return schoolInfo.toString();
    }
}
