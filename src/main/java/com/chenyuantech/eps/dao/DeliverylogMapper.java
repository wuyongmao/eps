package com.chenyuantech.eps.dao;

import com.chenyuantech.eps.bean.Deliverylog;
import com.chenyuantech.eps.bean.DeliverylogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverylogMapper {
    long countByExample(DeliverylogExample example);

    int deleteByExample(DeliverylogExample example);

    int deleteByPrimaryKey(String delid);

    int insert(Deliverylog record);

    int insertSelective(Deliverylog record);

    List<Deliverylog> selectByExample(DeliverylogExample example);

    Deliverylog selectByPrimaryKey(String delid);

    int updateByExampleSelective(@Param("record") Deliverylog record, @Param("example") DeliverylogExample example);

    int updateByExample(@Param("record") Deliverylog record, @Param("example") DeliverylogExample example);

    int updateByPrimaryKeySelective(Deliverylog record);

    int updateByPrimaryKey(Deliverylog record);
}