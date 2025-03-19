package com.example.demo.bizlogic.demo.service;

import java.util.List;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

public interface DemoService {
	public List<DemoResDTO> demo(DemoReqDTO paramDTO) throws Exception;
}
