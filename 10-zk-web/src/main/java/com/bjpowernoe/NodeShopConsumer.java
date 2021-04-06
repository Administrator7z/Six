package com.bjpowernoe;

import com.bjpowernode.model.Address;
import com.bjpowernode.model.MyOrder;
import com.bjpowernode.service.MyOrderService;
import com.bjpowernoe.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class NodeShopConsumer {

   /* public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("node-shop-consumer.xml");

        MyOrderService orderService = (MyOrderService) ctx.getBean("remoteOrderService");

        MyOrder order = orderService.createOrder("机械键盘",1001);
        System.out.println("消费者调用订单服务，获取的订单对象："+order);

    }*/

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("node-shop-consumer.xml");


        ShopService shopService= (ShopService) ctx.getBean("shopService");
        MyOrder order = shopService.buy(1002,"手机");
        System.out.println("===消费者调用订单服务，获取的订单对象："+order);


        //调用UserService服务
        //Address address = shopService.queryAddress(1001);
        //System.out.println("====消费者调用远程的用户服务："+address);

        System.in.read();

    }
}
