package com.example.demo.bizlogic.demo.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DemoResDTO {
	@Schema(description = "게시판 시퀀스", nullable = false, example = "k12@gmail.com")
	int seq = 0;
	@Schema(description = "게시판 제목", nullable = false, example = "k12@gmail.com")
	String title;
	@Schema(description = "게시판 내용", nullable = false, example = "k12@gmail.com")
	String content;
	String regDate;
	String regUser;
	String updDate;
	String updUser;
}
