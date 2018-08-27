package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.INSPECTION;
import com.chenyuantech.eps.bean.INSPECTIONExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface INSPECTIONMapper {
    long countByExample(INSPECTIONExample example);

    int deleteByExample(INSPECTIONExample example);

    int insert(INSPECTION record);

    int insertSelective(INSPECTION record);

    List<INSPECTION> selectByExample(INSPECTIONExample example);

    int updateByExampleSelective(@Param("record") INSPECTION record, @Param("example") INSPECTIONExample example);

    int updateByExample(@Param("record") INSPECTION record, @Param("example") INSPECTIONExample example);
}