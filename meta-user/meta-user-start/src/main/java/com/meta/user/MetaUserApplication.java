package com.meta.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"com.meta"})
@MapperScan("com.meta.user.mapper")
public class MetaUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MetaUserApplication.class, args);
    }
}
