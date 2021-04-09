package com.bjpowernode.service.impl;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 服务提供者，需要暴露服务
 */
@DubboService(interfaceClass = StudentService.class,version = "1.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("李思"+id);
        student.setAge(20);
        return student;
    }
}
