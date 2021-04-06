package com.bjpowernode.service.impl;

import com.bjpowernode.service.JavaFrameWorkService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.StringJoiner;

/**
 * @DubboService暴露服务
 *    register:是否向注册中心，注册服务
 */
@DubboService(interfaceClass = JavaFrameWorkService.class,timeout = 5000,register = false)
public class JavaFrameworkServiceImpl implements JavaFrameWorkService {
    @Override
    public String queryFrameworkName(String type) {
        StringJoiner joiner = new StringJoiner(":","{","}");
        // {a:b:c}
        if("db".equals(type)){
            joiner.add("mybatis").add("jpa").add("hibernate");
        } else if("web".equals(type)){
            joiner.add("springmvc").add("jsf").add("jfinal");
        } else if("rpc".equals(type)){
            joiner.add("dubbo").add("dubbox").add("spring cloud");
        }

        return joiner.toString();
    }
}
