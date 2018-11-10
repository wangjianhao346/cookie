package com.rain.cookie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.rain.cookie.dao")
public class CookieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookieApplication.class, args);
    }
}
