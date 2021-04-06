package com.bjpowernode.service;


import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class StudyService {

    /**
     * 引用远程服务
     * interfaceClass：远程服务的接口的class
     * url：直连方式中，使用的远程服务的地址
     */
    @DubboReference(interfaceClass = JavaFrameWorkService.class,check = false,
    url = "dubbo://localhost:20880")
    private JavaFrameWorkService frameWorkService;


    public String queryFrameName(String type){
        return frameWorkService.queryFrameworkName(type);
    }
}
