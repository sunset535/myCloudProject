package com.cloudbu.si.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cloudbu.si.microservice.dao")
@ComponentScan(basePackages = "com.cloudbu.si.microservice")
public class SiMicroserviceApplication {
	private static final Logger log = LoggerFactory.getLogger(SiMicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SiMicroserviceApplication.class, args);
		log.info("SI-Microservice服务启动完成...");
	}
}
