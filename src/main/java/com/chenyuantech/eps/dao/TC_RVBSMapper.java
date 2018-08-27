package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.TC_RVBS;
import com.chenyuantech.eps.bean.TC_RVBSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TC_RVBSMapper {
    long countByExample(TC_RVBSExample example);

    int deleteByExample(TC_RVBSExample example);

    int insert(TC_RVBS record);

    int insertSelective(TC_RVBS record);

    List<TC_RVBS> selectByExample(TC_RVBSExample example);

    int updateByExampleSelective(@Param("record") TC_RVBS record, @Param("example") TC_RVBSExample example);

    int updateByExample(@Param("record") TC_RVBS record, @Param("example") TC_RVBSExample example);
}