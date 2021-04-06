package com.bjpowernoe.service;

import com.bjpowernode.model.Address;
import com.bjpowernode.model.MyOrder;
import com.bjpowernode.service.MyOrderService;
import com.bjpowernode.service.MyUserService;

public class ShopService {

    private MyOrderService orderService;
    private SendMessage sendMessage;
    private MyUserService userService;

    public void setUserService(MyUserService userService) {
        this.userService = userService;
    }
    public void setOrderService(MyOrderService orderService) {
        this.orderService = orderService;
    }
    public void setSendMessage(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public MyOrder buy(Integer userId, String name){
        //买商品，需要生成订单 调用订单服务
        MyOrder order = orderService.createOrder(name,userId);
        //给用户发一个站内信，或者短信
        sendMessage.send("商品已经订购成功");
        //扣减库存
        return order;
    }


    public Address queryAddress(Integer userId){
        //用户服务
        Address address = userService.queryAddress(userId);
        return address;
    }
}
