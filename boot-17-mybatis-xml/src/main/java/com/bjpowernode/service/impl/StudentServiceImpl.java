package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;
    @Override
    public Student queryById(Integer id) {
        Student student = studentMapper.selectById(id);
        return student;
    }

    @Override
    public List<Student> queryAll() {
        return studentMapper.selectStudents();
    }
}
