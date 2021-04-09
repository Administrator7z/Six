package com.bjpowernode.service;

import com.bjpowernode.model.Student;

import java.util.List;

public interface StudentService {

    Student queryById(Integer id);

    List<Student> queryAll();
}
