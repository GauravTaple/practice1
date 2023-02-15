package com.reldyn.collection_framework.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		Map map = new java.util.HashMap();
		map.put(1, 12);
		map.put(2, 16);
		map.put(3, 10);
		//map convert to set 
		Set set = map.entrySet();
		//iterate the set using iterator method
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//iterate the map using Entry inteface
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for(Entry entry:entrySet)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
