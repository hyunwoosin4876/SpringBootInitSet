package com.example.demo.bizlogic.mapper.user;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.model.user.User;

@Mapper
public interface UserMapper {
	/**
	 * 회원 상세 정보
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User selMember(User user) throws Exception;
}
