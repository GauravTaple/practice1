package com.reldyn.collection_framework.Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_Example {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(50);
		t.add(26);
		t.add(10);
		System.out.println(t);
		double x = -1.0 / 0;
		System.out.println(Math.floor(x));
		double y = 200.7;
		System.out.println(Math.floor(y));

		Integer i = new Integer(26);
		int hashCode = i.hashCode();
		System.out.println(hashCode);

		t.removeAll(t);
		System.out.println(t);

	}

}
