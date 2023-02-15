package com.reldyn.collection_framework.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//using stream we can not add and remove the data
public class StreamExample2 {
	public static void main(String[] args) {
		
		List<String> s=Arrays.asList();
		System.out.println(s);
		
		//add the value using asList() method
		List<Integer> l=Arrays.asList(70,14,55,21,28,35);
		System.out.println(l);
		
		//stream() using max() method
		Integer max = l.stream().max(Integer::compare).get();
		System.out.println("Maximum no is:"+max);
		
		//stream() using max() method
		Integer min=l.stream().min(Integer::compare).get();
		System.out.println("Minimum no is:"+min);
		
		
		long count=l.stream().filter(n->n%2==0).count();
		System.out.println("Count:"+count);
		
		Set<Integer> collect = l.stream().collect(Collectors. toSet());
		//collect.stream().sorted().forEach(t->System.out.print(t+" "));
		System.out.println(collect);
		
		//allMatch() 
		boolean allMatch = l.stream().allMatch(n->n%2==0);
		System.out.println(allMatch);
		
		boolean allMatch2 = s.stream().allMatch(n->n.charAt(1)=='a');
		System.out.println(allMatch2);
		
		//Finding sum of all elements
		Integer reduce = l.stream().reduce(10,(element1,element2)->element1+element2);
		System.out.println(reduce);
		
		
		boolean noneMatch = l.stream().noneMatch(t->t>0);
		System.out.println(noneMatch);
	
	}

}
