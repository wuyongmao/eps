package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RvaExtMapper   {

 	List<?> selectPMCByPMN01PMN02(@Param("PMN01") String PMN01, @Param("PMN02") Integer PMN02);
   List  < LinkedHashMap<String, Object>> getsendmail( );

 	int updateFlag(@Param("RVB01") String RVB01,@Param("RVB02") int RVB02,@Param("FLAG"  )String FLAG);
 	
 	
 	
 	
}