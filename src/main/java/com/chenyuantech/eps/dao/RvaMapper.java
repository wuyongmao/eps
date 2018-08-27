package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Rva;
import com.chenyuantech.eps.bean.RvaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RvaMapper {
    long countByExample(RvaExample example);

    int deleteByExample(RvaExample example);

    int deleteByPrimaryKey(String rva01);

    int insert(Rva record);

    int insertSelective(Rva record);

    List<Rva> selectByExample(RvaExample example);

    Rva selectByPrimaryKey(String rva01);

    int updateByExampleSelective(@Param("record") Rva record, @Param("example") RvaExample example);

    int updateByExample(@Param("record") Rva record, @Param("example") RvaExample example);

    int updateByPrimaryKeySelective(Rva record);

    int updateByPrimaryKey(Rva record);
}