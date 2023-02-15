package com.reldyn.collection_framework.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {
	public static void main(String[] args) {
		List<Product> l=new ArrayList<>();
		l.add(new Product(1, "Dress", 20000));
		l.add(new Product(2, "Pants", 2500));
		l.add(new Product(3, "Shirts", 2000));
		l.add(new Product(4, "kurta", 25000));
		
		//filtering collection without using stream
    	List<Long> l1=new ArrayList<>();
		for(Product product:l)
		{
			if (product.price<=15000) {
				l1.add(product.price);
			}
		}
		System.out.println(l1);
		System.out.println("-------------------------");
		
		//filtering collection using stream
		List<Long> collect = l.stream().filter(t->t.price>=15000).map(t->t.price).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
