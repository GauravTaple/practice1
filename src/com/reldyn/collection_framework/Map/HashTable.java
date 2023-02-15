package com.reldyn.collection_framework.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer,String>();
		h.put(1,"QK");
		h.put(2,"JK");
		h.put(3, "LK");
		System.out.println(h);
		
		System.out.println(h.getOrDefault(1, "Not Found"));
		System.out.println(h.getOrDefault(2, "Not Found"));
		System.out.println(h.getOrDefault(5, "Not Founded"));
		
		Set<Entry<Integer, String>> entrySet = h.entrySet();
		for(Entry<Integer, String> e:entrySet)
		{
			System.out.println(e);
		}
		System.out.println("---------------------------------------");
		SortedMap<Integer, String> sm=new TreeMap();
		sm.putAll(h);
		System.out.println(sm);
		System.out.println(sm.equals(h));
	}

}
