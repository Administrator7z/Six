package com.bjpowernode;

import com.bjpowernode.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OrderServiceProviderMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("orderservice-provder.xml");
        ((ClassPathXmlApplicationContext)ctx).start();
        System.out.println("OrderService服务启动了");
        System.in.read();
    }
}
