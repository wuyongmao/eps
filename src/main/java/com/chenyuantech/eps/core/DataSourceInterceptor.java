package com.chenyuantech.eps.core;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

//@Aspect 
@Component
public class DataSourceInterceptor {
	// 数据源1
	public static final String SOURCE_PLAN = "dataSourcePro";
	// 数据源2
	public static final String SOURCE_FUND = "dataSourceDev";

	// @Before(value = "execution(* com.chenyuantech.eps.service.*.*(..))")
	// @Before(value =
	// "execution(* com.chenyuantech.eps.service.IUserService.getUser())")
	// @Before(value = "execution(* com.chenyuantech.eps.ERPservice.*.*(..))")
	public void setdataSourcePro(JoinPoint jp) {
		// System.out.println("============setdataSourcePro=========");
		DataSourceContextHolder.setDataSource(SOURCE_PLAN);
	}

	// @After(value = "execution(* com.chenyuantech.eps.ERPservice.*.*(..))")
	public void setdataSourceOne1(JoinPoint jp) {
		// System.out.println("============setdataSourceOne=========");
		DataSourceContextHolder.setDataSource(SOURCE_FUND);
	}

	// @Before(value = "execution(* com.chenyuantech.eps.service.*.*(..))")
	public void setdataSourceDev(JoinPoint jp) {
		DataSourceContextHolder.setDataSource(SOURCE_FUND);

	}

}