package com.chenyuantech.eps.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chenyuantech.eps.bean.PMM;
import com.chenyuantech.eps.bean.PMMPO;
import com.chenyuantech.eps.bean.PMN;

public interface PMM_PMNExtMapper {

	public List<PMMPO> findPMMPMNResultMap() throws Exception;

	/**
	 * 查询采购明细
	 */
	public List<Map<String, Object>> findPMMPMNLinkList(@Param("pmm") PMM pmm, @Param("pmn") PMN pmn

	, @Param("sort") String sort  , @Param("ISAUTOJQ") String ISAUTOJQ ) throws Exception;
	
	
	@Select("SELECT PMN01,PMN02,PMN04,PMN041,PMMUD02,PMN07,YS,IMA021  FROM pmm m JOIN pmn n ON m.pmm01=n.pmn01 AND m.pmmud02='${PMMUD02}'   ")
	public List<Map<String, Object>> getPMNListbyPMMUD02(@Param("PMMUD02") String  PMMUD02);
	
	@Select("SELECT PMN01,PMN02,PMN04,PMN041,PMMUD02,PMN07,YS,IMA021  FROM pmm m JOIN pmn n ON m.pmm01=n.pmn01 and pmn16='2' AND m.pmmud02='${PMMUD02}'   ")
	public List<Map<String, Object>> getPMNListbyPMMUD02_t(@Param("PMMUD02") String  PMMUD02);
	
	
	@Select("SELECT PMN02 as PMN02t,PMN02  FROM pmm m JOIN pmn n ON m.pmm01=n.pmn01 AND  PMN01='${PMN01}'   ")
	public List<Map<String, Object>> getPMNPMN02ByPMN01(@Param("PMN01") String  PMN01);
	
	
	
	

}
