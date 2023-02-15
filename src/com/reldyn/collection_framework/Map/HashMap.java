package com.reldyn.collection_framework.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {
	public static void main(String[] args) {
		Map<Integer, String> m = new java.util.HashMap<Integer, String>();
		m.put(1, "jk");
		m.put(2, "lm");
		m.put(3, "no");
		System.out.println(m);

		System.out.println(m.containsKey(4));

		System.out.println(m.containsValue("no"));

		System.out.println(m.entrySet());

		m.remove(m);
		System.out.println(m);

		//entrySet()
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> en : entrySet) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		System.out.println("-------------------------------------------");
		Set<Entry<Integer, String>> entrySet2 = m.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry);
		}
		//hashCode() method
		System.out.println(m.hashCode());
		
		//replace()
		m.replace(1,"man");
		System.out.println(m);
		
		//values()
		System.out.println(m.values());
	}

}
