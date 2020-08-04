package com.mystery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.mystery.dao")
public class Demo09Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo09Application.class, args);
    }
}
