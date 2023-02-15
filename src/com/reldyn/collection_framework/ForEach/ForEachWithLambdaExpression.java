package com.reldyn.collection_framework.ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdaExpression {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Football");
		l.add("Cricket");
		l.add("Kabaddi");
		l.add("Kho-kho");
		l.add("Hockey");
		System.out.println(l);
		
		//Using Lambda expression
		System.out.println("Using Lambda Expression:-");
		l.forEach(s->System.out.println(s));
		System.out.println("------------------");
		
		//Using Method Reference
		System.out.println("Using Method Reference:-");
		l.forEach(System.out::println);
		
		System.out.println("-------------------");
		//Using ForEachOrdered
		System.out.println("Using ForEachOrdered:-");
		l.stream().forEachOrdered(s->System.out.println(s));
	}

}
