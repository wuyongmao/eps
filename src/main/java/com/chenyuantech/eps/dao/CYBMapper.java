package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.CYB;
import com.chenyuantech.eps.bean.CYBExample;
import com.chenyuantech.eps.bean.CYBKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CYBMapper {
    long countByExample(CYBExample example);

    int deleteByExample(CYBExample example);

    int deleteByPrimaryKey(CYBKey key);

    int insert(CYB record);

    int insertSelective(CYB record);

    List<CYB> selectByExample(CYBExample example);

    CYB selectByPrimaryKey(CYBKey key);

    int updateByExampleSelective(@Param("record") CYB record, @Param("example") CYBExample example);

    int updateByExample(@Param("record") CYB record, @Param("example") CYBExample example);

    int updateByPrimaryKeySelective(CYB record);

    int updateByPrimaryKey(CYB record);
}