package com.example.demo.bizlogic.serviceImpl.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bizlogic.mapper.demo.DemoMapper;
import com.example.demo.bizlogic.model.demo.Demo;
import com.example.demo.bizlogic.service.demo.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Autowired
	private DemoMapper demoDAO;
	
	@Override
	public List<Demo> demo(Demo paramDTO) throws Exception {
		return demoDAO.selectBoard(paramDTO);
	}
	
}
