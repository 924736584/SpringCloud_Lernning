package com.deyuan.springcloud.provoder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deyuan.springcloud.provoder.mapper")
public class micserviceproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(micserviceproviderApplication.class,args);
    }
}
