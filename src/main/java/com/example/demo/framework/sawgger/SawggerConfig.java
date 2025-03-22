package com.example.demo.framework.sawgger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.framework.database.DataBaseConfig;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SawggerConfig {

	Logger logger = LoggerFactory.getLogger(DataBaseConfig.class);
	
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(apiInfo());
	}

	private Info apiInfo() {
		return new Info()
				.title("Springdoc 테스트")
				.description("Springdoc을 사용한 Swagger UI 테스트")
				.version("1.0.0");
	}
}
	