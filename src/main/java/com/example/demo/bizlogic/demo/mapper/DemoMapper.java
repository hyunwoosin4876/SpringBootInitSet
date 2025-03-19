package com.example.demo.bizlogic.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

@Mapper
public interface DemoMapper {
	public List<DemoResDTO> selectBoard(DemoReqDTO paramDTO) throws Exception;
}
