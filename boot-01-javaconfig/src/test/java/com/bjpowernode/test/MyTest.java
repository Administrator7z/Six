package com.bjpowernode.test;

import com.bjpowernode.config.SpringAnnoConfig;
import com.bjpowernode.model.Cat;
import com.bjpowernode.model.Student;
import com.bjpowernode.model.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    /**
     * 测试xml容器
     */
    @Test
    public void test01(){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) ctx.getBean("myStudent");

        System.out.println("student="+student);
    }

    /**
     * 使用JavaConfig
     *
     */
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnoConfig.class);
        Student student = ctx.getBean(Student.class);
        System.out.println("student="+student);

    }


    @Test
    public void test03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnoConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println("student createStudent ="+student);

    }

    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnoConfig.class);
        Student student = (Student) ctx.getBean("zhangStudent");
        System.out.println("student zhangStudent ="+student);

    }

    @Test
    public void test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnoConfig.class);
        Date date  = (Date) ctx.getBean("myDate");
        System.out.println("date = " + date);

    }

    @Test
    public void test06(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAnnoConfig.class);

        Cat cat = (Cat) ctx.getBean("myCat");

        System.out.println("cat="+cat);


        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println("tiger="+tiger);

    }
}
