package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.WXBSIZETMP;
import com.chenyuantech.eps.bean.WXBSIZETMPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXBSIZETMPMapper {
    long countByExample(WXBSIZETMPExample example);

    int deleteByExample(WXBSIZETMPExample example);

    int deleteByPrimaryKey(String WXB05T);

    int insert(WXBSIZETMP record);

    int insertSelective(WXBSIZETMP record);

    List<WXBSIZETMP> selectByExample(WXBSIZETMPExample example);

    WXBSIZETMP selectByPrimaryKey(String WXB05T);

    int updateByExampleSelective(@Param("record") WXBSIZETMP record, @Param("example") WXBSIZETMPExample example);

    int updateByExample(@Param("record") WXBSIZETMP record, @Param("example") WXBSIZETMPExample example);

    int updateByPrimaryKeySelective(WXBSIZETMP record);

    int updateByPrimaryKey(WXBSIZETMP record);
}