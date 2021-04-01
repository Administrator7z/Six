package com.bjpowernode.service;

import com.bjpowernode.model.Address;

public interface MyUserService {

    Address queryAddress(Integer userId);
}
