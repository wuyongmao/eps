package com.chenyuantech.eps.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CYB_ExtMapper { 
	@Select(" WITH  cy AS  ( SELECT c.cyb01,max(c.cyb02) cyb02 FROM  cyb c GROUP BY cyb01 UNION SELECT c.cyb01,MIN(c.cyb02) cyb02 FROM  cyb c GROUP BY cyb01    ) " 
	+" SELECT c.cyb01,c.cyb02,c.cyb03,c.cyb04,c.cyb07,c.cyb05,b.wxb08,b.wxb09 FROM CYB C INNER JOIN WXB B ON C.CYB01 = B.WXB05 "
	+" INNER JOIN cy ON  cy.cyb01=c.cyb01 AND cy.cyb02=c.cyb02 "
	+ " where c.CYB01='${CYB01}'  "
	+ "") 
	List<LinkedHashMap<String, Object>> selectCYBRecoder(@Param("CYB01") String CYB01  );

	
	@Select("SELECT DISTINCT cyb01 AS \"id\",cyb01 AS \"text\" FROM cyb")
	List<LinkedHashMap<String, Object>> getCYBList(  );
	
}