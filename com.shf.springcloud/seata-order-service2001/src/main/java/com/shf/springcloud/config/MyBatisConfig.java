package com.shf.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.shf.springcloud.dao"})
public class MyBatisConfig {
}
