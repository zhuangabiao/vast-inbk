package com.vast.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.vast.base.mapper")
public class VastBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(VastBaseApplication.class, args);
    }

}
