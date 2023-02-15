package com.reldyn.collection_framework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSet_example {
	public static void main(String[] args) {
		Set<Integer> i=new HashSet<>();
		i.add(10);
		i.add(5);
		i.add(9);
		System.out.println(i);
		
		HashSet s=new HashSet();
		s.add(10);
		s.add('C');
		s.add("Gaurav");
		s.add(60);
		s.add(70);
		System.out.println(s);
		s.addAll(i);
		System.out.println(s);
		
		System.out.println(s.contains('C'));
		
		System.out.println(s.containsAll(i));
		
		System.out.println(s.equals(i));
		System.out.println("------------------------------------");
		s.forEach(t->System.out.print(t+" "));
		System.out.println();
		
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");	
		}
		
		System.out.println();
		s.clone();
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
	}

}
