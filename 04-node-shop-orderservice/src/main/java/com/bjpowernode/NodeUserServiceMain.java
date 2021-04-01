package com.bjpowernode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class NodeUserServiceMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("node-shop-orderservice.xml");
        cxt.start();
        System.out.println("订单服务启动了");
        System.in.read();
    }
}
