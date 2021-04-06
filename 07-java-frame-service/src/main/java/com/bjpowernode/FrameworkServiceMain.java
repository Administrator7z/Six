package com.bjpowernode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class FrameworkServiceMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("frameservice-provider.xml");

        ctx.start();

        System.in.read();
    }
}
