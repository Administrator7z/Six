package com.bjpowernode.service.impl;

import com.bjpowernode.model.Order;
import com.bjpowernode.service.OrderService;

import java.util.UUID;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Integer userId, String name, Float price, Integer amount) {
        System.out.println("执行了OrderServiceImpl的createOrder()");
        Order order = new Order();
        order.setId(UUID.randomUUID().toString().toUpperCase());
        order.setAmount(amount);
        order.setName(name);
        order.setPrice(price);
        order.setUserId(userId);
        return order;
    }
}
