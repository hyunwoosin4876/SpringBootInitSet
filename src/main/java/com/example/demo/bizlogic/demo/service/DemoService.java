package com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.service;

import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.request.SpringBootInitSetReqDTO;
import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.response.SpringBootInitSetResDTO;

public interface SpringBootInitSetService {
	public SpringBootInitSetResDTO SpringBootInitSet(SpringBootInitSetReqDTO paramDTO) throws Exception;
}
