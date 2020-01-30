package com.git.rjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 红茶
 */
@MapperScan("com.git.rjc")
@SpringBootApplication
public class RjcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RjcApplication.class, args);
    }

}
