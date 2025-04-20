package com.example.demo.bizlogic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Common {
	/** 사용 구분 */
	private String useYn; 
	/** 등록자 아이디  */
	private String regId; 
	/** 등록일자 */
	private String regDt; 
	/** 수정자 아이디 */
	private String updId; 
	/** 수정 일자 */
	private String updDt; 
}
