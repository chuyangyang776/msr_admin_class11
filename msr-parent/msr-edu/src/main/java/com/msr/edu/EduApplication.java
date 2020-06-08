package com.msr.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 主类 或 启动类
@SpringBootApplication
@MapperScan("com.msr.edu.mapper")
@ComponentScan(basePackages = {"com.msr.edu","com.msr.common"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class);
    }
}
