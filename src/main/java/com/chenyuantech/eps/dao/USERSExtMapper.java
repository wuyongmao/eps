package com.chenyuantech.eps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chenyuantech.eps.bean.USERS;

public interface USERSExtMapper {
    

    List  findUsersByParam(@Param("users") USERS users );

    
 	List<String> getPMCEmaillist(@Param("PMMUD02") String PMMUD02 );

 	
 	 String getPMC03(@Param("PMMUD02") String PMMUD02);


    
}