package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import org.springframework.stereotype.Service;

@Service("myService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务的方法doSome");
    }
}
