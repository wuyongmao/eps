package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chenyuantech.eps.bean.INSPECTION;
import com.chenyuantech.eps.bean.INSPECTIONExample;

public interface INSPECTION_ExtMapper {
	long countByExample(INSPECTIONExample example);

	@Select("delete from INSPECTION WHERE REGULATIONID=#{id}")
	int deleteById(@Param("id") String id);
    
	List<Map<String,Object>> selectINSPECTIONList(@Param("insp")INSPECTION insp,@Param("sort")String sort);
    
    
    
	@Select("SELECT DELLOTMIN,DELLOTMAX FROM INSPECTION")
	List<LinkedHashMap<String, Object>> selectMinAndMax();

	@Select("SELECT DELLOTMIN,DELLOTMAX FROM INSPECTION WHERE REGULATIONID NOT IN (#{regid})")
	List<LinkedHashMap<String, Object>> selectMinAndMaxExcSelf(@Param("regid") String regid);

	@Select("SELECT * FROM INSPECTION")
	List<INSPECTION> selectAllRegulation();

}