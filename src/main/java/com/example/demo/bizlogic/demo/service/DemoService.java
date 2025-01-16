package com.example.demo.bizlogic.demo.service;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

public interface DemoService {
	public DemoResDTO demo(DemoReqDTO paramDTO) throws Exception;
}
