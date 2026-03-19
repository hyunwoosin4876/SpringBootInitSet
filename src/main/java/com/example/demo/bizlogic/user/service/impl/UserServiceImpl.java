package com.example.demo.bizlogic.user.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bizlogic.demo.service.impl.DemoServiceImpl;
import com.example.demo.bizlogic.user.mapper.UserMapper;
import com.example.demo.bizlogic.user.model.User;
import com.example.demo.bizlogic.user.service.UserService;

import io.swagger.v3.oas.annotations.servers.Server;

@Server
public class UserServiceImpl implements UserService {
	Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User selMember(User user) throws Exception {
		return userMapper.selMember(user);
	}
}
