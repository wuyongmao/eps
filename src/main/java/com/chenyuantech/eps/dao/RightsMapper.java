package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Rights;
import com.chenyuantech.eps.bean.RightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightsMapper {
    long countByExample(RightsExample example);

    int deleteByExample(RightsExample example);

    int deleteByPrimaryKey(String rightsid);

    int insert(Rights record);

    int insertSelective(Rights record);

    List<Rights> selectByExample(RightsExample example);

    Rights selectByPrimaryKey(String rightsid);

    int updateByExampleSelective(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByExample(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);
}