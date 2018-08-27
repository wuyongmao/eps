package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Allkind;
import com.chenyuantech.eps.bean.AllkindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllkindMapper {
    long countByExample(AllkindExample example);

    int deleteByExample(AllkindExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(Allkind record);

    int insertSelective(Allkind record);

    List<Allkind> selectByExample(AllkindExample example);

    Allkind selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") Allkind record, @Param("example") AllkindExample example);

    int updateByExample(@Param("record") Allkind record, @Param("example") AllkindExample example);

    int updateByPrimaryKeySelective(Allkind record);

    int updateByPrimaryKey(Allkind record);
}