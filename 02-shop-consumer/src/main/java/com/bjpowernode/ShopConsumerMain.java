package com.bjpowernode;

import com.bjpowernode.model.Order;
import com.bjpowernode.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopConsumerMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        OrderService orderService = (OrderService) ctx.getBean("remoteOrderService");
        Order order = orderService.createOrder(1, "a", 10F, 10);
        System.out.println("远程接口执行后的结果："+order);
    }
}
