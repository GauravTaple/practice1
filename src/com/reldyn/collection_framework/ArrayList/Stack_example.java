package com.reldyn.collection_framework.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stack_example {
	public static void main(String[] args) {
		List<Character> asList = Arrays.asList('A','B','C','D','E');
		System.out.println(asList);
		
		Stack<Integer> s=new Stack();
		System.out.println(s);
		s.add(10);
		s.add(20);
		s.add(40);
		System.out.println(s);
		s.addAll(s);
		System.out.println(s);
		
		//clone()
		s.clone();
		System.out.println(s);
	
		//contains()
		System.out.println(s.contains(50)); 
		
		//containsAll()
		System.out.println(s.containsAll(s));
		System.out.println("----------");
		
		//elementAt()
		s.elementAt(0);
		System.out.println(s.get(0));
		System.out.println(s.empty());
		
		//s.equals(s);
		System.out.println(s.equals(asList));
		
		//firstElement()
		System.out.println(s.firstElement());
		System.out.println("------");
		
		//forEach()
		s.forEach(t->System.out.print(t+" "));
		System.out.println();
		
		s.pop();
		System.out.println(s);
		
		s.push(5);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		//clear()
		s.clear();
		System.out.println(s);
	}

}
