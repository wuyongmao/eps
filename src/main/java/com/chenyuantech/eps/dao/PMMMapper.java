package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.PMM;
import com.chenyuantech.eps.bean.PMMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMMMapper {
    long countByExample(PMMExample example);

    int deleteByExample(PMMExample example);

    int deleteByPrimaryKey(String PMM01);

    int insert(PMM record);

    int insertSelective(PMM record);

    List<PMM> selectByExample(PMMExample example);

    PMM selectByPrimaryKey(String PMM01);

    int updateByExampleSelective(@Param("record") PMM record, @Param("example") PMMExample example);

    int updateByExample(@Param("record") PMM record, @Param("example") PMMExample example);

    int updateByPrimaryKeySelective(PMM record);

    int updateByPrimaryKey(PMM record);
}