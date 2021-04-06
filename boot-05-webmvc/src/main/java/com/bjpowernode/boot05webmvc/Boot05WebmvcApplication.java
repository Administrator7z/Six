package com.bjpowernode.boot05webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot05WebmvcApplication {

	//声明bean ，使用@Bean

	public static void main(String[] args) {

		// run()方法内部是创建spring容器对象
		SpringApplication.run(Boot05WebmvcApplication.class, args);
	}

}
