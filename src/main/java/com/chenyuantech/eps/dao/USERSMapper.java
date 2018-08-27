package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.bean.USERSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface USERSMapper {
    long countByExample(USERSExample example);

    int deleteByExample(USERSExample example);

    int deleteByPrimaryKey(String ACCID);

    int insert(USERS record);

    int insertSelective(USERS record);

    List<USERS> selectByExample(USERSExample example);

    USERS selectByPrimaryKey(String ACCID);

    int updateByExampleSelective(@Param("record") USERS record, @Param("example") USERSExample example);

    int updateByExample(@Param("record") USERS record, @Param("example") USERSExample example);

    int updateByPrimaryKeySelective(USERS record);

    int updateByPrimaryKey(USERS record);
}