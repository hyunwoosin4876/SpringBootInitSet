package com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dao.SpringBootInitSetDAO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.request.SpringBootInitSetReqDTO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.response.SpringBootInitSetResDTO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.service.SpringBootInitSetService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SpringBootInitSetServiceImpl implements SpringBootInitSetService {
	
	@Autowired
	private SpringBootInitSetDAO SpringBootInitSetDAO;
	
	@Override
	public SpringBootInitSetResDTO SpringBootInitSet(SpringBootInitSetReqDTO paramDTO) throws Exception {
		return null;
	}
	
}
