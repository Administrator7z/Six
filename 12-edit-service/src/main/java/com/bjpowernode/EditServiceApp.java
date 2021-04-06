package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class EditServiceApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("edit-service.xml");

        ctx.start();

        System.out.println("编辑菜单服务启动了");

        System.in.read();
    }
}
