package com.example.demo.bizlogic.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.demo.model.Demo;

@Mapper
public interface DemoMapper {
	public List<Demo> selectBoard(Demo paramDTO) throws Exception;
}
