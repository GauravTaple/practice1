package com.reldyn.collection_framework.ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Maruti");
		s.add("Suzuki");
		s.add("Honda");
		s.add("Tata");
		s.add("Chevrolet");
		System.out.println(s);
		
		//iterate the string using advanced for loop using if condition
		for (String var:s) {
			if(var.startsWith("T"))
			{
				System.out.println(var);
			}
		}
		System.out.println("--------");
		
		//iterate the string using stream 
		s.stream().forEach(y->System.out.println(y));
		
		//iterate the String using stream and filter
		s.stream().filter(t->t.startsWith("C")).forEach(t->System.out.println(t));
		
		System.out.println("----------------------------------------------------------------");
		
		Map<Integer, String> map =new TreeMap();
		map.put(1, "Puma");
		map.put(2, "Nike");
		map.put(3, "Jack&Jones");
		System.out.println(map);
		
		//iterate the map using forEach()
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("-----------");
		
		//iterate the map using stream and entrySet() method
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		System.out.println("----");
		
		//iterate the map using stream() and filter()
		map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		
		
		
	}

}
