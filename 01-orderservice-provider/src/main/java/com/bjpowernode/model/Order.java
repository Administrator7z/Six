package com.bjpowernode.model;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = -8177606497167374175L;
    private String id;
    private String name;
    private Integer userId;
    private Float price;
    private Integer amount;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
