package com.chenyuantech.eps.test;

import java.util.List;

import org.junit.Test;

public class SplitEmail {
	
	
	@Test
	public void testSpli(){
		
		String a="7412";
		String b="  aa@ a/bbb/c,DFD;";
		String[] l=b.split("\\|\\*|/|;|,");
		String str = "1+2-3+5-64*25+25/65";
		String[] array = str.split("\\+|-|\\*|/");
		for (String string : l) {
			System.out.println( string.trim());
		}
//		for (String string : array) {
//			System.out.println( string.trim());
//
//		}
//		
		
		
	}

}
