package com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.request.SpringBootInitSetReqDTO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.response.SpringBootInitSetResDTO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.service.SpringBootInitSetService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SpringBootInitSetConstroller {
	
	@Autowired
	private SpringBootInitSetService domeService; // test service
	
	/**
	 * 테스트
	 * @param paramDTO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value="test", notes="test")
	@RequestMapping(value="/SpringBootInitSet/test", method={RequestMethod.POST})
	public SpringBootInitSetResDTO SpringBootInitSet(SpringBootInitSetReqDTO paramDTO) throws Exception {
		return domeService.SpringBootInitSet(paramDTO);
	}
}