package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Boot011CommandlinerunnerApplication implements CommandLineRunner {

	@Resource
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(Boot011CommandlinerunnerApplication.class, args);
		System.out.println("spring的容器对象初始化之后");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner接口的run方法");
		userService.getUser();
	}
}
