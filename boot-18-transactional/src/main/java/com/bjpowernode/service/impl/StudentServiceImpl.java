package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    //表示方法有事务
    @Transactional
    @Override
    public int addStudent(Student student) {
        int rows = studentDao.insertStudent(student);

        //int res = 10 / 0 ;

        return rows;
    }
}
