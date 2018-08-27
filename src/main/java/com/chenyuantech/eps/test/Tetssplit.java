package com.chenyuantech.eps.test;

import java.util.TreeSet;

import org.junit.Test;

public class Tetssplit {
	
	
	
	
	@Test
	public void Testset(){
		String t="5-6,5-6,6-7";
		String [] ts=  t.split(",");
		TreeSet<String> set=new TreeSet<String>();
		for(String i:ts ){
			System.out.println(i+"---------");
			set.add(i);
		}
		System.out.println("-=============");
 
		for(String j:set){
			System.out.println(j+"---------");
                                                                                                                                                                                                                                                                                                                      
		}
		
	}
	
	
}
