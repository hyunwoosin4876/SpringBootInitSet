package com.example.SpringBootInitSet.framework.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

import com.example.SpringBootInitSet.framework.Constances;

@Configuration
@MapperScan(basePackages = Constances.BASE_PACKAGE_PREFIX, sqlSessionFactoryRef = Constances.SQL_SESSION_FACTORY)
public class DataBaseConfig {}