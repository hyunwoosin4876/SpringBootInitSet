package com.example.demo.bizlogic.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

@Repository
public interface DemoDAO {
	public DemoResDTO selectTest() throws Exception;
}
