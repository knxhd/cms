package com.knxhd.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: TianLuHua
 * @date  2020/1/9 12:05
 */
@MapperScan(basePackages = "com.knxhd.cms.mapper")
@SpringBootApplication
public class CmsApplication {


    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }

}
