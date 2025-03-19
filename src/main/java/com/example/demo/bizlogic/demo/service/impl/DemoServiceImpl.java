package com.example.demo.bizlogic.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;
import com.example.demo.bizlogic.demo.mapper.DemoMapper;
import com.example.demo.bizlogic.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Autowired
	private DemoMapper demoDAO;
	
	@Override
	public List<DemoResDTO> demo(DemoReqDTO paramDTO) throws Exception {
		return demoDAO.selectBoard(paramDTO);
	}
	
}
