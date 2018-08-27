package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.SHD;
import com.chenyuantech.eps.bean.SHDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SHDMapper {
    long countByExample(SHDExample example);

    int deleteByExample(SHDExample example);

    int deleteByPrimaryKey(String SHD01);

    int insert(SHD record);

    int insertSelective(SHD record);

    List<SHD> selectByExample(SHDExample example);

    SHD selectByPrimaryKey(String SHD01);

    int updateByExampleSelective(@Param("record") SHD record, @Param("example") SHDExample example);

    int updateByExample(@Param("record") SHD record, @Param("example") SHDExample example);

    int updateByPrimaryKeySelective(SHD record);

    int updateByPrimaryKey(SHD record);
}