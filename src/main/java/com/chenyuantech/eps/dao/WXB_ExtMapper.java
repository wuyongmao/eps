package com.chenyuantech.eps.dao;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WXB_ExtMapper {
	/*
	 * @Select(
	 * "SELECT m.pmmud02,n.pmn04,n.pmn041,n.pmn07,IMA021,b.wxb14,b.wxb15,b.wxb16,n.tc_rvbs17,n.tc_rvbs16,n.ys,n.pmn41  , b.wxb01,b.wxb02,b.wxb03,b.wxb04,b.wxb05,b.wxb06,b.wxb07,b.wxb08,b.wxb09,b.wxb10,b.wxb11,b.wxb12,b.wxb13  "
	 * + "  FROM wxb b INNER JOIN pmm m ON m.pmm01=b.wxb01" +
	 * " INNER JOIN pmn n ON n.pmn02=b.wxb02 AND b.wxb01=n.pmn01 " +
	 * " where PMN01='${PMN01}' and PMN02=${PMN02}" + "order by   wxb11" + " ")
	 */ 
	List<LinkedHashMap<String, Object>> selectWXBByPMN01PMN02(@Param("PMN01") String PMN01, @Param("PMN02") Integer PMN02,
			@Param("WXB03") String WXB03, @Param("WXB04") String WXB04,@Param("WXB05") String WXB05
			,@Param("WXB11")String WXB11,@Param("ISSH")String ISSH,
			@Param("sort")String sort,@Param("PMMUD02") String PMMUD02,@Param("ROLE")String ROLE);

	
	List<LinkedHashMap<String, Object>> selectWXBByWXB05T(@Param("WXB05") String WXB05, @Param("WXB11") String WXB11  );

	
	List<LinkedHashMap<String, Object>> getWXBByWXB05(@Param("WXB05") String WXB05 );
	List<LinkedHashMap<String, Object>> getWXBByWXB05s(@Param("WXB05s") String [] WXB05s );
	List<LinkedHashMap<String, Object>> getWXBByWXB05s2(@Param("WXB05s") String [] WXB05s );

	
	@Update("update wxb set wxb03 = null where wxb03 ='${WXB03}' ")
	int updateWxb(@Param("WXB03")String WXB03);
	
//	@Select("SELECT shd01 AS \"id\",shd01 AS \"text\" FROM shd")
	List<LinkedHashMap<String, Object>> getSHDList(@Param("PMMUD02")  String PMMUD02,@Param("ROLE")String ROLE );

	 
	int getCountPmm02(@Param("WXB01s") String [] WXB01s);
	
	
	List<LinkedHashMap<String, Object>> getWXBSHD(@Param("SHD01") String SHD01 );
	
	
	
	//@Select("update wxb set wxb03='${WXB03}' where wxb05='${WXB05}' ")
	int updateWXB03ByWXB05(@Param("WXB03") String WXB03,@Param("WXB05") String WXB05);

	@Select("SELECT NVL( SUM(tc_rvbs04 ),0)  FROM wxbsize WHERE   wxb05='${WXB05}' ")
	BigDecimal getSumWxbSizeByWXB05(@Param("WXB05") String WXB05 );

	 
	
	
	 @Select(" SELECT  COUNT(*)  FROM pmn WHERE pmn01='${WXB01}' "
	 		+ "AND pmn02=${WXB02}  AND substr(pmn04,1,2) IN ('40','50','46') ")
	int getcountFL(@Param("WXB01") String WXB01,@Param("WXB02") Integer WXB02);

	
	
		
	 @Select(" SELECT  COUNT(*)  FROM pmn WHERE pmn01='${WXB01}' "
	 		+ "AND pmn02=${WXB02}   ")
	int getcountPMN(@Param("WXB01") String WXB01,@Param("WXB02") Integer WXB02);

	
	
	 
	 
	
	
	/**
	 * 箱号编码
	 * 
	 * @param PMMUD02
	 * @return
	 */
	@Select("SELECT (  CASE WHEN COUNT(1)>0 THEN    '${PMMUD02}'|| to_char(SYSDATE,'yyyymmdd')|| 'C'  || TRIM( to_char(max(to_number(substr(wxb05,16,19)))+1,'0000') )  "
			+ " ELSE '${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')|| 'C'  ||'0001'    END  )"
			+ " t FROM wxb  WHERE wxb05 LIKE ('${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')|| 'C' ||'____')  "
			+ "  ")
	String getWXB05(@Param("PMMUD02") String PMMUD02);
	
	
	
	
	
	
	
	
	/**
	 * 送货单编码
	 * 
	 * @param PMMUD02
	 * @return
	 */
	@Select("SELECT (  CASE WHEN COUNT(1)>0 THEN    '${PMMUD02}'|| to_char(SYSDATE,'yyyymmdd')|| TRIM( to_char(COUNT(1)+1,'00') )"
			+ " ELSE '${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')||'01'    END  ) t FROM shd "
			+ " WHERE shd01 LIKE ('${PMMUD02}'||to_char(SYSDATE,'yyyymmdd')||'__')  "
			+ "  ")
	String getWXB03(@Param("PMMUD02") String PMMUD02);

 
	

}