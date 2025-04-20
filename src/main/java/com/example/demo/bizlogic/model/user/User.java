package com.example.demo.bizlogic.model.user;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bizlogic.model.Common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User extends Common {
	/** 회원 일련번호 */
	private int memberSn;
	/** 회원 아이디  */
	private String memberId; 
	/** 회원 비밀번호  */
	private String memberPw;
	/** 회원 이름  */
	private String memberName;
	/** 회원 성별(공통코드)  */
	private String memberSex;
	/** 회원 나이 */
	private int memberAge;
	/** 회원 권한 */
	private String memberAuth;
}
