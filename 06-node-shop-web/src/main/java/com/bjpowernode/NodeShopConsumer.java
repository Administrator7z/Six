package com.bjpowernode;

import com.bjpowernode.model.Address;
import com.bjpowernode.model.MyOrder;
import com.bjpowernode.service.MyOrderService;
import com.bjpowernode.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NodeShopConsumer {

   /* public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("node-shop-consumer.xml");

        MyOrderService orderService = (MyOrderService) ctx.getBean("remoteOrderService");

        MyOrder order = orderService.createOrder("机械键盘",1001);
        System.out.println("消费者调用订单服务，获取的订单对象："+order);

    }*/

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("node-shop-consumer.xml");


        ShopService shopService= (ShopService) ctx.getBean("shopService");
        MyOrder order = shopService.buy(1001,"键盘");
        System.out.println("消费者调用订单服务，获取的订单对象："+order);


        //调用UserService服务
        Address address = shopService.queryAddress(1002);
        System.out.println("消费者调用远程的用户服务："+address);

    }
}
