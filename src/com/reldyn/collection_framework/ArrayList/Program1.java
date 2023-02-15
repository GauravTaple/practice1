package com.reldyn.collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Program1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a);
		//add()
		a.add(1);
		a.add("Gaurav");
		a.add('a');
		System.out.println(a);
		a.remove(1);
		System.out.println(a);

		ArrayList<String> a1 = new ArrayList();
		a1.add("Gaurav");
		a1.add("team");
		a1.add(0, "Man");
		System.out.println(a1);

	//addAll()
	a.addAll(a1);
	System.out.println(a);
	System.out.println(a1);
	
	//removeAll()
//	a.removeAll(a1);
//  System.out.println(a);
 
        //removeIf()
		a1.removeIf(n -> (n.charAt(0) == 'G'));
		for (String i : a1) {
			System.out.println(i);
		}
		
//		//retainAll()
//		a.retainAll(a1);
//		System.out.println(a);
//		//removeAll
//		a.removeAll(a1);
//		System.out.println(a);
		
		//size()
		System.out.println(a.size());
		System.out.println("---------");
		
		//contains()
		System.out.println(a.contains("Gaurav"));
		System.out.println(a.contains(5));
		
		//containsAll()
		System.out.println(a.contains(a1));
		
		//get()
		System.out.println(a.get(0));
		System.out.println(a.get(2));
		try {
		System.out.println(a.get(5));
		}catch (Exception e) {
			System.out.println("Exception handled...!!!");
		}
		
		System.out.println(a.indexOf("Gaurav"));
		System.out.println("-----------------");
		
		//Using For Loop
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}
		
		//clear()
		a.clear();
		System.out.println(a);
		System.out.println("Empty...!!!");

	}
}
