package com.bjpowernode.service;

import com.bjpowernode.model.MyOrder;

public interface MyOrderService {

    MyOrder createOrder(String name,Integer userId);
}
