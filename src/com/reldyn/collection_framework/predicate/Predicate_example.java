package com.reldyn.collection_framework.predicate;

import java.util.function.Predicate;

public class Predicate_example {
	public static void main(String[] args) {
		Predicate<String> p=i->i.charAt(0)=='G';
		System.out.println(p.test("Gaurav"));
	}

}
