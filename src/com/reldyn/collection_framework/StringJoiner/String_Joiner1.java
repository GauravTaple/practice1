package com.reldyn.collection_framework.StringJoiner;

import java.util.StringJoiner;

public class String_Joiner1 {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("JK");
		sj.add("kk");
		sj.add("MK");
		sj.add("LK");
		System.out.println(sj);
		
		sj.add("PT");
		sj.add("PC");
		System.out.println(sj);
	}

}
