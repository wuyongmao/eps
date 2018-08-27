package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.IMA;
import com.chenyuantech.eps.bean.IMAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMA_ExtMapper {
    long countByExample(IMAExample example);

    int deleteByExample(IMAExample example);

    int deleteByPrimaryKey(String IMA01);

    int insert(IMA record);

    int insertSelective(IMA record);

    List<IMA> selectByExample(IMAExample example);

    IMA selectByPrimaryKey(String IMA01);

    int updateByExampleSelective(@Param("record") IMA record, @Param("example") IMAExample example);

    int updateByExample(@Param("record") IMA record, @Param("example") IMAExample example);

    int updateByPrimaryKeySelective(IMA record);

    int updateByPrimaryKey(IMA record);
}