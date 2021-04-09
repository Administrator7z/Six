package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    /**
     * @DubboReference: 使用远程服务。
     */
    @DubboReference(interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @GetMapping("/student/query")
    public Student queryStudent(Integer id){
        return studentService.queryStudent(id);
    }
}
