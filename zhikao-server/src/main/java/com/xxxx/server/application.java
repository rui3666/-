package com.xxxx.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author rui on 2022/2/8
 */
@SpringBootApplication
@MapperScan("com.xxxx.server.mapper")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
