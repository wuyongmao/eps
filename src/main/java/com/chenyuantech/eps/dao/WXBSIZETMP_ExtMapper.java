package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WXBSIZETMP_ExtMapper {

	@Select("select * from WXBSIZETMP WHERE   wxb05T =   '${WXB05T}' ")
	List<LinkedHashMap<String, Object>> getWXBSIZETMP(
			@Param("WXB05T") String WXB05T);

	@Update("update WXBSIZETMP set wxb05='${WXB05}' where wxb05t= '${WXB05T}'   ")
	int updateWXBTMPSIZE(@Param("WXB05T") String WXB05T);

	@Update("update WXBSIZETMP set wxb05='${WXB05}' , wxb05T='${WXB05}'  where wxb05t= '${WXB05T}'   ")
	int updateWXBTMPSIZE2(@Param("WXB05T") String WXB05T,@Param("WXB05") String WXB05);

	
	
	@Select("select count(*) from WXBSIZETMP WHERE   wxb05T =   '${WXB05T}' ")
	int getcountWXB05(	@Param("WXB05T") String WXB05T);

}