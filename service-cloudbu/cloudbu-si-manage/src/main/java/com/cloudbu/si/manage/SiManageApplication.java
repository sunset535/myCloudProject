package com.cloudbu.si.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cloudbu.si.manage")
@EnableFeignClients(basePackages = "com.cloudbu.common.feign")
public class SiManageApplication {
	private static final Logger log = LoggerFactory.getLogger(SiManageApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SiManageApplication.class, args);
        log.info("SI-Platform后台管理服务启动完成...");
    }

}
