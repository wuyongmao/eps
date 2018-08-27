package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Pnb;
import com.chenyuantech.eps.bean.PnbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PnbMapper {
    long countByExample(PnbExample example);

    int deleteByExample(PnbExample example);

    int insert(Pnb record);

    int insertSelective(Pnb record);

    List<Pnb> selectByExample(PnbExample example);

    int updateByExampleSelective(@Param("record") Pnb record, @Param("example") PnbExample example);

    int updateByExample(@Param("record") Pnb record, @Param("example") PnbExample example);
}