package com.example.demo.framework.sawgger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.framework.database.DataBaseConfig;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SawggerConfig {

	Logger logger = LoggerFactory.getLogger(DataBaseConfig.class);
	
	/**
	 * swagger3 그룸 빈
	 *  - 더 필요하면 추가 하면됨
	 * @return
	 */
	@Bean
	public GroupedOpenApi groupApi() {
		String[] pathsToMatch = {"/SpringBootInitSet/**"};
		
		return GroupedOpenApi.builder()
							.group("api")
							.pathsToMatch(pathsToMatch)
							.build();
	}
	
	/**
	 * swagger3 설정
	 * @return
	 */
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
	