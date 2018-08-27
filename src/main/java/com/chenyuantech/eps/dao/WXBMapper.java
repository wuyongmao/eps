package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.bean.WXBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXBMapper {
    long countByExample(WXBExample example);

    int deleteByExample(WXBExample example);

    int deleteByPrimaryKey(String WXB05);

    int insert(WXB record);

    int insertSelective(WXB record);

    List<WXB> selectByExample(WXBExample example);

    WXB selectByPrimaryKey(String WXB05);

    int updateByExampleSelective(@Param("record") WXB record, @Param("example") WXBExample example);

    int updateByExample(@Param("record") WXB record, @Param("example") WXBExample example);

    int updateByPrimaryKeySelective(WXB record);

    int updateByPrimaryKey(WXB record);
}