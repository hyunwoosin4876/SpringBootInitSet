package com.example.demo.bizlogic.mapper.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.model.demo.Demo;

@Mapper
public interface DemoMapper {
	public List<Demo> selectBoard(Demo paramDTO) throws Exception;
}
