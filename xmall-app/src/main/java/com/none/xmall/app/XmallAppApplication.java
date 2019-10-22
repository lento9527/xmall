package com.none.xmall.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan({"com.none.xmall.db.mapper","com.none.xmall.app.dao"})
@EnableScheduling
public class XmallAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallAppApplication.class, args);
    }

}
