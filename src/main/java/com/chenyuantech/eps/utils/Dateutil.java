package com.chenyuantech.eps.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutil {

	public  static String  getCurrentDate( String patten ){
		
		return new SimpleDateFormat(patten).format(new Date());
		
		
	}
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		System.out.println(Dateutil.getCurrentDate("yyyy-MM-dd"));// new Date()为获取当前系统时间

		 
	}
	
	
}
