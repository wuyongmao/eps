package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.PMC;
import com.chenyuantech.eps.bean.PMCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMCMapper {
    long countByExample(PMCExample example);

    int deleteByExample(PMCExample example);

    int insert(PMC record);

    int insertSelective(PMC record);

    List<PMC> selectByExample(PMCExample example);

    int updateByExampleSelective(@Param("record") PMC record, @Param("example") PMCExample example);

    int updateByExample(@Param("record") PMC record, @Param("example") PMCExample example);
}