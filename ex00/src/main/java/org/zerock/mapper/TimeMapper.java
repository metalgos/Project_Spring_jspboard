package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT sysdate from dual")
	public String getTime();
	
	// XML을 이용한 부분
	public String getTime2();
}