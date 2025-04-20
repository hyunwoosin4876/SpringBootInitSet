package com.example.demo.bizlogic.controller.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bizlogic.model.demo.Demo;
import com.example.demo.bizlogic.service.demo.DemoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import reactor.core.publisher.Flux;

@Tag(name = "예제 API", description = "Swagger 테스트용 API")
@RestController
@RequestMapping("/SpringBootInitSet")
public class DemoConstroller {
	
	@Autowired
	private DemoService domeService; // test service
	
	/**
	 * 테스트
	 * @param paramDTO
	 * @return
	 * @throws Exception
	 */
    @Operation(summary = "테스트 메소드", description = "테스트 메소드 입니다.")
	@GetMapping(value="/test")
	public Flux<Demo> SpringBootInitSet(Demo paramDTO) throws Exception {
    	List<Demo> list = domeService.demo(paramDTO);
		// return Flux.just(list);
    	return Flux.fromIterable(list);
	}
}