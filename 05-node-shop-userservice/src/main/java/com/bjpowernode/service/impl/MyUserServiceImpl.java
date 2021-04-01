package com.bjpowernode.service.impl;

import com.bjpowernode.model.Address;
import com.bjpowernode.service.MyUserService;

public class MyUserServiceImpl implements MyUserService {
    @Override
    public Address queryAddress(Integer userId) {
        Address address= new Address();
        if( 1001 == userId){
            address.setName("李思");
            address.setCity("北京");
            address.setMobile("138000000");
            address.setStreet("两广路");
        } else if(1002 == userId){
            address.setName("张强");
            address.setCity("上海");
            address.setMobile("13911111111");
            address.setStreet("两广路");
        }
        return address;
    }
}
