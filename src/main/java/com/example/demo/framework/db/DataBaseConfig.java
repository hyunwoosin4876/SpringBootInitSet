package com.example.demo.framework.db;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.example.demo.framework.Constances;

@Configuration
@MapperScan(basePackages = Constances.BASE_PACKAGE_PREFIX, sqlSessionFactoryRef = Constances.SQL_SESSION_FACTORY)
public class DataBaseConfig {
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		Resource[] res = new PathMatchingResourcePatternResolver().getResources(Constances.BASE_MAPPER_PATH);																				
		sessionFactory.setMapperLocations(res);
		
		return sessionFactory.getObject();
	}
	
}