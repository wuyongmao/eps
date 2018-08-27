package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DdlogExtMapper   {

 	List<?> selectPMCByPMN01PMN02(@Param("PMN01") String PMN01, @Param("PMN02") Integer PMN02);

    List  < LinkedHashMap<String, Object>>	 getddlogsendmail();
 	
 	int updateReplydd(@Param("REPLYDD") String REPLYDD, @Param("DDID") String DDID);
}