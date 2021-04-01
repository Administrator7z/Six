package com.bjpowernode.service.impl;

import com.bjpowernode.model.MyOrder;
import com.bjpowernode.service.MyOrderService;

import java.util.UUID;

public class MyOrderServiceImpl implements MyOrderService {
    @Override
    public MyOrder createOrder(String name, Integer userId) {
        System.out.println("使用订单服务MyOrderServiceImpl#createOrder");
        MyOrder order = new MyOrder();
        order.setOrderId(UUID.randomUUID().toString());
        order.setName(name);
        order.setUserId(userId);
        return order;
    }
}
