package com.example.demo.bizlogic.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;
import com.example.demo.bizlogic.demo.mapper.DemoMapper;
import com.example.demo.bizlogic.demo.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoMapper demoDAO;
	
	@Override
	public DemoResDTO demo(DemoReqDTO paramDTO) throws Exception {
		return null;
	}
	
}
