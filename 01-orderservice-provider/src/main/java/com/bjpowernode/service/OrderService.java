package com.bjpowernode.service;

import com.bjpowernode.model.Order;

public interface OrderService {
    Order createOrder(Integer userId, String name, Float price, Integer amount);
}
