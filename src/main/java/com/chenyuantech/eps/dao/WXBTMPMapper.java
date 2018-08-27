package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.WXBTMP;
import com.chenyuantech.eps.bean.WXBTMPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXBTMPMapper {
    long countByExample(WXBTMPExample example);

    int deleteByExample(WXBTMPExample example);

    int deleteByPrimaryKey(String WID);

    int insert(WXBTMP record);

    int insertSelective(WXBTMP record);

    List<WXBTMP> selectByExample(WXBTMPExample example);

    WXBTMP selectByPrimaryKey(String WID);

    int updateByExampleSelective(@Param("record") WXBTMP record, @Param("example") WXBTMPExample example);

    int updateByExample(@Param("record") WXBTMP record, @Param("example") WXBTMPExample example);

    int updateByPrimaryKeySelective(WXBTMP record);

    int updateByPrimaryKey(WXBTMP record);
}