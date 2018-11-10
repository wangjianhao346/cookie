package com.rain.cookie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rain.cookie.dao")
public class CookieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookieApplication.class, args);
        System.out.println("launch successful !");
    }
}
