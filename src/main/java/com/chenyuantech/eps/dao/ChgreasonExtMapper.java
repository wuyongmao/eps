package com.chenyuantech.eps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chenyuantech.eps.bean.Chgreason;

public interface ChgreasonExtMapper  {
	List<Chgreason>   findChgreasonByParam(@Param("chgreason") Chgreason chgreason
			,@Param("sort") String sort 
			,@Param("order") String order );
 
}