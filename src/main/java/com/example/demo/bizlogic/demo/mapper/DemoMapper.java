package com.example.demo.bizlogic.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

@Mapper
public interface DemoMapper {
	public DemoResDTO selectTest() throws Exception;
}
