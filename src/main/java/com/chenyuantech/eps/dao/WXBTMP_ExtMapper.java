package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.WXBTMP;
import com.chenyuantech.eps.bean.WXBTMPExample;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WXBTMP_ExtMapper {

	List<LinkedHashMap<String, Object>> selectWXBTMPByParam(@Param("wxbtmp") WXBTMP wxbtmp, @Param("WXB11") String WXB11);

	@Select("select * from wxbtmp where wxb05t='${WXB05T}' ")
	WXBTMP selectWXBTMPByUnqueK(@Param("WXB05T") String WXB05T);

	@Select("select * from wxbtmp where wxb05t='${WXB05T}' and wtr='N' ")
	WXBTMP selectWXBTMPByUnqueK2(@Param("WXB05T") String WXB05T);

	@Update("update wxbtmp set wtr='Y' ,wxb05='${WXB05}',wxb05T='${WXB05}' where wxb05T='${WXB05T}'  ")
	int updatewxbtmp(@Param("WXB05") String WXB05, @Param("WXB05T") String WXB05T);

	/**
	 * 临时箱号编码
	 * 
	 * @param PMMUD02
	 * @return
	 */
	@Select("SELECT (  CASE WHEN COUNT(1)>0 THEN    '${PMMUD02}'|| to_char(SYSDATE,'yyyymmdd')|| 'L'  || TRIM( to_char(max(to_number(substr(wxb05t,16.19)))+1,'0000') )"
			+ " ELSE '${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')|| 'L'  ||'0001'    END  )"
			+ " t FROM wxbtmp  WHERE wxb05T LIKE ('${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')|| 'L' ||'____')  " + "  ")
	String getWXB05T(@Param("PMMUD02") String PMMUD02);

	@Select("select wxb15 from wxbtmp where wxb05t='${WXB05T}'   ")
	String getWXB15ByWXB05T(@Param("WXB05T") String WXB05T);
}