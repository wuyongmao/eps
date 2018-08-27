package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TableColumsMapper  {

	 
    @Select( " SELECT    COLUMN_NAME field, COMMENTS  title  , 100  as width FROM  USER_COL_COMMENTS t WHERE  TABLE_NAME = #{tablename} order by title")  
    public List<LinkedHashMap<String, Object>> 
    getTableColums(String tablename );  
     
	
	
}
