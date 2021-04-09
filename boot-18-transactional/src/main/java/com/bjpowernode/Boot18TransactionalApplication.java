package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 可选的，启动事务管理
@EnableTransactionManagement
// 扫描包
@MapperScan(basePackages = "com.bjpowernode.dao")
@SpringBootApplication
public class Boot18TransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot18TransactionalApplication.class, args);
	}

}
