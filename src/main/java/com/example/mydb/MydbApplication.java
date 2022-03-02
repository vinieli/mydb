package com.example.mydb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.mydb.mapper")
public class MydbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydbApplication.class, args);
	}

}
