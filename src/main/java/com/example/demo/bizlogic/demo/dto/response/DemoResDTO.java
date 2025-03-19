package com.example.demo.bizlogic.demo.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemoResDTO {
	int seq = 0;
	String title;
	String content;
	String regDate;
	String regUser;
	String updDate;
	String updUser;
}
