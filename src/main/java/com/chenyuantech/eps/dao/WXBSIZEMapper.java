package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.WXBSIZE;
import com.chenyuantech.eps.bean.WXBSIZEExample;
import com.chenyuantech.eps.bean.WXBSIZEKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXBSIZEMapper {
    long countByExample(WXBSIZEExample example);

    int deleteByExample(WXBSIZEExample example);

    int deleteByPrimaryKey(WXBSIZEKey key);

    int insert(WXBSIZE record);

    int insertSelective(WXBSIZE record);

    List<WXBSIZE> selectByExample(WXBSIZEExample example);

    WXBSIZE selectByPrimaryKey(WXBSIZEKey key);

    int updateByExampleSelective(@Param("record") WXBSIZE record, @Param("example") WXBSIZEExample example);

    int updateByExample(@Param("record") WXBSIZE record, @Param("example") WXBSIZEExample example);

    int updateByPrimaryKeySelective(WXBSIZE record);

    int updateByPrimaryKey(WXBSIZE record);
}