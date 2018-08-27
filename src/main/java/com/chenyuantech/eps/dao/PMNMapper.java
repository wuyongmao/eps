package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.bean.PMNExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMNMapper {
    long countByExample(PMNExample example);

    int deleteByExample(PMNExample example);

    int insert(PMN record);

    int insertSelective(PMN record);

    List<PMN> selectByExample(PMNExample example);

    int updateByExampleSelective(@Param("record") PMN record, @Param("example") PMNExample example);

    int updateByExample(@Param("record") PMN record, @Param("example") PMNExample example);
}