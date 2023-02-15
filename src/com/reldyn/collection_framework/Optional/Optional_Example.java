package com.reldyn.collection_framework.Optional;

import java.util.Optional;

public class Optional_Example {
	public static void main(String[] args) {
//		String[] str=new String[10];
//		String lowerCase = str[5].toLowerCase();
//		System.out.println(lowerCase);toLowerCase
		
		
		
		String[] str1=new String[9];
		str1[5]="G";
		
		Optional<String> op=Optional.ofNullable(str1[5]);
		if (op.isPresent()) {
			String lowerCase2 = str1[5].toLowerCase();
			System.out.println(lowerCase2);
			
		}
		else {
			System.out.println("String Value is not present...!!!");
		}
	
		
	}

}
