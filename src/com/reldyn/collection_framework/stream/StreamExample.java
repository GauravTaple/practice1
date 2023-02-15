package com.reldyn.collection_framework.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(2);
		obj.add(7);
		obj.add(90);
		obj.add(70);
		obj.add(5);
		System.out.println(obj);
		
		//stream() using filter() method
		List<Integer> l= obj.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		//stream() using map() method
		List<Integer> l1=obj.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l1);
		
		//stream() using count() method
		long l2= obj.stream().filter(t->t<=10).count();
		System.out.println(l2);
		
		//stream() using sorted() method
		List l3=obj.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		ArrayList<String> s=new ArrayList<>();
		s.add("Honey");
		s.add("Manas");
		s.add("Gaurav");
		s.add("Anu");
		s.add("Darsh");
		System.out.println(s);
		
		
		List<String> s3=s.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(s3);
		
	}

}
