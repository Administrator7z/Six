package com.bjpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 所在的类叫做启动类
 */
@SpringBootApplication
public class Boot02QuickApplication {

	// SpringBoot以main开始运行的
	public static void main(String[] args) {
		SpringApplication.run(Boot02QuickApplication.class, args);
	}

}
