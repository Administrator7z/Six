package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class FileMeunApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("file-service.xml");

        ctx.start();
        System.out.println("文件菜单服务启动了");

        System.in.read();
    }
}
