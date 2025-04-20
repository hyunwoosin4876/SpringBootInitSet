package com.example.demo.bizlogic.serviceImpl.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;

import com.example.demo.bizlogic.mapper.user.UserMapper;
import com.example.demo.bizlogic.model.user.User;
import com.example.demo.bizlogic.service.user.UserService;
import com.example.demo.bizlogic.serviceImpl.demo.DemoServiceImpl;

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
