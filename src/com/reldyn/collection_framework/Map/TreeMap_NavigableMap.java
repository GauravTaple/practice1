package com.reldyn.collection_framework.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_NavigableMap {
	public static void main(String[] args) {
		NavigableMap<Character, Integer> n=new TreeMap<>();
		n.put('a', 1);
		n.put('b', 2);
		n.put('c', 3);
		System.out.println(n);
		
		System.out.println(n.descendingMap());
		
		System.out.println(n.headMap('c'));
		
		System.out.println(n.tailMap('b'));
		
		System.out.println(n.subMap('c', 'd'));
		
		
				
		
	}

}
