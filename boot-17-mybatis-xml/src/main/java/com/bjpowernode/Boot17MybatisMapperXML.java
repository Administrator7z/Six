package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan:扫描dao的接口和mapper文件
 *     basePackages：dao接口所在的包名，可以指定多个包
 *     位置：在springboot启动类的上面
 */
@MapperScan(basePackages = {"com.bjpowernode.dao"})
@SpringBootApplication
public class Boot17MybatisMapperXML {

	public static void main(String[] args) {
		SpringApplication.run(Boot17MybatisMapperXML.class, args);
	}

}
