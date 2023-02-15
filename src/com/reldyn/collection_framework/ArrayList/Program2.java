package com.reldyn.collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Program2 {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList<>();
		System.out.println(obj);
		obj.add(5);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		
		//sort()
		Collections.sort(obj);
		System.out.println(obj);
		
		//reverse()
		Collections.reverse(obj);
		System.out.println(obj);
		
		//Iterator
		Iterator var =obj.iterator();
		while(var.hasNext())
		{
			System.out.print(var.next()+" ");
		}
		System.out.println();
		
		//toArray()
		Object[] array = obj.toArray();
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Value of index "+i+" is "+array[i]);
		}
		
		
	}
}
