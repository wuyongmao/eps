package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Ddlog;
import com.chenyuantech.eps.bean.DdlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdlogMapper {
    long countByExample(DdlogExample example);

    int deleteByExample(DdlogExample example);

    int deleteByPrimaryKey(String ddid);

    int insert(Ddlog record);

    int insertSelective(Ddlog record);

    List<Ddlog> selectByExample(DdlogExample example);

    Ddlog selectByPrimaryKey(String ddid);

    
    int updateByExampleSelective(@Param("record") Ddlog record, @Param("example") DdlogExample example);

    int updateByExample(@Param("record") Ddlog record, @Param("example") DdlogExample example);

    int updateByPrimaryKeySelective(Ddlog record);

    int updateByPrimaryKey(Ddlog record);
}