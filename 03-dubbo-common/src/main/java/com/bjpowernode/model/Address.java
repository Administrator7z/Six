package com.bjpowernode.model;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -8621798541064698966L;
    private String name;
    private String mobile;
    private String city;
    private String street;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
