package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Mapper:表示当前类是 mybatis 中的dao接口
 *         框架会创建此接口的dao代理对象
 *
 *    位置： 在dao接口的上面
 */
//@Mapper
public interface StudentMapper {

    Student selectById(@Param("stuId") Integer id);

    // 定义其他数据库的操作方法
    List<Student> selectStudents();
}
