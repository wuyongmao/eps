package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Colorchklog;
import com.chenyuantech.eps.bean.ColorchklogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorchklogMapper {
    long countByExample(ColorchklogExample example);

    int deleteByExample(ColorchklogExample example);

    int deleteByPrimaryKey(String chkid);

    int insert(Colorchklog record);

    int insertSelective(Colorchklog record);

    List<Colorchklog> selectByExample(ColorchklogExample example);

    Colorchklog selectByPrimaryKey(String chkid);

    int updateByExampleSelective(@Param("record") Colorchklog record, @Param("example") ColorchklogExample example);

    int updateByExample(@Param("record") Colorchklog record, @Param("example") ColorchklogExample example);

    int updateByPrimaryKeySelective(Colorchklog record);

    int updateByPrimaryKey(Colorchklog record);
}