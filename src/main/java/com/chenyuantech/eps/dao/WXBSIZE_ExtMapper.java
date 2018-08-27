package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WXBSIZE_ExtMapper {

	@Select("select * from WXBSIZE WHERE   wxb05 =   '${WXB05}' ")
	List<LinkedHashMap<String, Object>> getWXBSIZE(@Param("WXB05") String WXB05);

	
	@Select("select count(*)  from WXBSIZE WHERE   wxb05 =   '${WXB05}' ")
	int getWXBSIZECount(@Param("WXB05") String WXB05);
	
	
	@Select("select tc_rvbs03 as \"SIZE\", tc_rvbs04 as Q ,tc_rvbs16 as L,tc_rvbs17 as R    from WXBSIZE WHERE   wxb05 =   '${WXB05}' ")
	List<LinkedHashMap<String, Object>> getWXBSIZEByWXB05(@Param("WXB05") String WXB05);

 
	@Select("SELECT tc_rvbs03 AS \"id\",tc_rvbs03 AS \"text\" FROM tc_rvbs  where tc_rvbs01='${PMN01}' and tc_rvbs02=${PMN02} ")
	List<LinkedHashMap<String, Object>> getSIZEList(@Param("PMN01")String PMN01,@Param("PMN02") Integer PMN02);

	
}