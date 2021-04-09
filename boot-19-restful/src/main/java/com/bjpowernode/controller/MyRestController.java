package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 是@Controller和@ResponseBody的组合
 */
@RestController
public class MyRestController {

    //创建资源 http://localhost:8080/myweb/student/lisi/22

    /**
     * value = "url"
     *  {} : 定义路径变量， {自定义名称} ，表示url中的实际数据
     *
     * @PathVariable: 获取路径变量的值
     *     属性： value 路径变量名称
     *     位置： 在形参的前面
     */
    @PostMapping("/student/{stuname}/{stuage}")
    public String addStudent(@PathVariable(value = "stuname") String name,
                             @PathVariable("stuage") Integer age,
                             Integer pageNo,
                             Integer pageSize){
        return "添加学生name："+name + ",pageNo="+pageNo + ",pageSize="+pageSize;
    }


    /**
     * 修改资源
     * PS: 路径变量名称和形参名一样， @PathVariable可以没有value
     */
    @PutMapping("/student/{id}/{name}")
    public String modifyStudent(@PathVariable Integer id,
                                @PathVariable String name){
        return "修改学生： id="+id+",name="+name;
    }

    /**
     * 删除资源
     */
    @DeleteMapping("/student/{id}")
    public String removeStudent(@PathVariable Integer id){
        return "删除学生：id="+id;
    }

    /**
     * 查询 一个student
     * 单个资源不使用复数
     */
    // http://localhost:8080/myweb/student/1005
    @GetMapping("/student/{id}")
    public String queryById(@PathVariable Integer id){
        return "查询学生单个资源， id="+id;
    }

    // http://localhost:8080/myweb/student/2013
    @GetMapping("/student/class/{classId}")
    public String queryClass(@PathVariable Integer classId){
        return "查询班级单个资源， classId="+classId;
    }

    /**
     * 多个资源，使用复数形式
     */
    @GetMapping("/students")
    public String queryAll(){
        return "查询多个学生";
    }

}
