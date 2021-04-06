package com.bjpowernode.config;

import com.bjpowernode.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class MyWebConfig  {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean =
                new ServletRegistrationBean( new MyServlet(),"/myservlet");
        return bean;
    }

    //注册过滤器
    /*@Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean  = new FilterRegistrationBean();

        //创建过滤器对象
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        //设置编码的方式
        filter.setEncoding("utf-8");
        //设置request，response对象使用encoding的属性值
        filter.setForceEncoding(true);
        //设置过滤器的处理地址
        bean.setFilter(filter);
        bean.addUrlPatterns("/*"); //所有请求都使用此过滤器
        return bean;
    }*/
}
