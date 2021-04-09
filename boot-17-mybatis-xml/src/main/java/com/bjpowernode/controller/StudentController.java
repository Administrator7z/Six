package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public Student queryStudent(Integer id){
        return studentService.queryById(id);
    }



    @RequestMapping("/student/all")
    @ResponseBody
    public List<Student> queryAllStudent(){
        return studentService.queryAll();
    }
}
