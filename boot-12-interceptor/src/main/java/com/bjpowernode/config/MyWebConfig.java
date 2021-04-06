package com.bjpowernode.config;

import com.bjpowernode.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfigurer:看做springmvc的配置文件
 *
 */
@Configuration
public class MyWebConfig  implements WebMvcConfigurer {

    //把拦截器对象注入到spring容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String path [] = { "/user/**"}; // 拦截user开头的所有请求
        String excludePath [] = {"/user/login"}; //user/login不拦截
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excludePath);

    }
}
