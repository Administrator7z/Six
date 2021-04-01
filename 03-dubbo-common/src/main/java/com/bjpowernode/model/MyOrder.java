package com.bjpowernode.model;

import java.io.Serializable;

public class MyOrder implements Serializable {

    private static final long serialVersionUID = -7071612509674081694L;
    private String orderId;
    private String name;
    private Integer userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                '}';
    }
}
