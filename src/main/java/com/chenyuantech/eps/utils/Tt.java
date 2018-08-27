package com.chenyuantech.eps.utils;

public class Tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tString[] = { "123456","223456"   };

		for (int i = 0; i < tString.length - 1; i++) {
			if (tString[i].substring(0, 1).equals(
					tString[i + 1].substring(0, 1)) ==false) {
				System.out.println("-----不相等");
				return ;
			}
		}
		
		System.out.println("-----相等");
		
	}
}