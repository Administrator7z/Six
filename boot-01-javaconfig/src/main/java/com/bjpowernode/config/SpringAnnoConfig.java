package com.bjpowernode.config;

import com.bjpowernode.model.Student;
import org.springframework.context.annotation.*;

import java.util.Date;

/**
 *  @Configuration：表示当前类是配置spring容器的
 *    位置：在类的上面
 */
@ComponentScan(value = "com.bjpowernode.model")
@PropertySource(value = "classpath:app.properties")
@ImportResource( value = {"classpath:application.xml"})
@Configuration
public class SpringAnnoConfig {
    /**
     * 定义方法：
     *  方法的返回值是java对象，对象注入到spring容器中
     *
     * @Bean： 创建对象的，等同于<bean>
     *     位置：在方法的上面
     *
     * 默认创建的对象名称是 方法名
     */
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("张青");
        student.setAge(22);
        student.setId(1003);
        return student;
    }

    /**
     * 使用@Bean,通过他的name属性，指定自定义的名称
     */
    @Bean(name = "zhangStudent")
    public Student makeStudent(){
        Student student = new Student();
        student.setName("张风峰");
        student.setAge(22);
        student.setId(1003);
        return student;
    }

    @Bean
    public Date myDate(){
        return new Date();
    }

   /* @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean xx = ...
        xx.setDataSource();
        xx.setLocaton(yy);
        return xx;
    }*/
}
