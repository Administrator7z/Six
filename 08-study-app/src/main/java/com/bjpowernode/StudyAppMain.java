package com.bjpowernode;

import com.bjpowernode.service.StudyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudyAppMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("study-consume.xml");

        StudyService studyService= (StudyService) ctx.getBean("studyService");

        String res = studyService.queryFrameName("web");
        System.out.println("res="+res);
    }
}
