package com.reldyn.collection_framework.lmbda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Expression {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(9);
		arr.add(22);
		arr.add(90);
		arr.add(70);
		
		//using lambda expression and forEach loop we can iterate
	//	arr.forEach(n->{System.out.println(n);});
		List<Integer> l2= arr.stream().filter(t->t%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("------------------");
		
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
