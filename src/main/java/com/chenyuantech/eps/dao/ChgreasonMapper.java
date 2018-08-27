package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Chgreason;
import com.chenyuantech.eps.bean.ChgreasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChgreasonMapper {
    long countByExample(ChgreasonExample example);

    int deleteByExample(ChgreasonExample example);

    int deleteByPrimaryKey(String chgid);

    int insert(Chgreason record);

    int insertSelective(Chgreason record);

    List<Chgreason> selectByExample(ChgreasonExample example);

    Chgreason selectByPrimaryKey(String chgid);

    int updateByExampleSelective(@Param("record") Chgreason record, @Param("example") ChgreasonExample example);

    int updateByExample(@Param("record") Chgreason record, @Param("example") ChgreasonExample example);

    int updateByPrimaryKeySelective(Chgreason record);

    int updateByPrimaryKey(Chgreason record);
}