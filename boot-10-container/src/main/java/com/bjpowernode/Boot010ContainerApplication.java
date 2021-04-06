package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.xml.ws.Service;

@SpringBootApplication
public class Boot010ContainerApplication {

	public static void main(String[] args) {
		//run返回值是容器对象
		ApplicationContext ctx = SpringApplication.run(Boot010ContainerApplication.class, args);
		// 从容器中获取指定对象就可以了
		SomeService someService= (SomeService) ctx.getBean("myService");

		someService.doSome();
	}

}
