package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TC_RVBS_ExtMapper { 
	
	@Select("select tc_rvbs01, tc_rvbs02, tc_rvbs03, tc_rvbs04, tc_rvbs06"
			+ ", tc_rvbs16, tc_rvbs17  from TC_RVBS WHERE   TC_RVBS01 = '${PMN01}' and TC_RVBS02 = ${PMN02} ")
	   List  < LinkedHashMap<String, Object>> getTcRVBS(@Param("PMN01")String PMN01,@Param("PMN02") int PMN02 );

	
	
	
}