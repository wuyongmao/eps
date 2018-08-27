package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Rvb;
import com.chenyuantech.eps.bean.RvbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RvbMapper {
    long countByExample(RvbExample example);

    int deleteByExample(RvbExample example);

    int insert(Rvb record);

    int insertSelective(Rvb record);

    List<Rvb> selectByExample(RvbExample example);

    int updateByExampleSelective(@Param("record") Rvb record, @Param("example") RvbExample example);

    int updateByExample(@Param("record") Rvb record, @Param("example") RvbExample example);
}