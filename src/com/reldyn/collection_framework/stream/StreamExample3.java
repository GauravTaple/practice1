package com.reldyn.collection_framework.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Vector;

public class StreamExample3 {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Gaurav","Honey","Geeks");
		Optional<String> reduce = l.stream().reduce((firstName,secondName)->firstName.length()>=secondName.length()?firstName:secondName);
		reduce.ifPresent(System.out::print);
		
//		Vector<Integer> v=new Vector<>();
//		v.add(54);
//		v.add(52);
//		v.add(2, 50);
//		v.remove(0);
//		v.addElement(54);
//		v.capacity();
//		System.out.println(v);
	}

}
