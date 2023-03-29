package com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dao;

import org.springframework.stereotype.Repository;

import com.example.SpringBootInitSet.bizlogic.SpringBootInitSet.dto.response.SpringBootInitSetResDTO;

@Repository
public interface SpringBootInitSetDAO {
	public SpringBootInitSetResDTO selectTest() throws Exception;
}
