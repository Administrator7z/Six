package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class NodeOrderServiceMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("node-shop-orderservice.xml");

        ctx.start();

        System.out.println("订单服务启动了");

        System.in.read();
    }
}
