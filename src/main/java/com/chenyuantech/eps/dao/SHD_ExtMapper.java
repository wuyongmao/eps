package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface SHD_ExtMapper {
	List<LinkedHashMap<String, Object>> selectSHDBySHD01SHD02(@Param("SHD01") String SHD01,  @Param("SHD02") String SHD02,@Param("PMMUD02") String PMMUD02,@Param("ROLE") String ROLE);
    
	
	
	@Update("update shd set shd07='N' where SHD01='${SHD01}'  ")
	int updateSHD(@Param("SHD01") String SHD01);


}