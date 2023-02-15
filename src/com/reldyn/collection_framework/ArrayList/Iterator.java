package com.reldyn.collection_framework.ArrayList;

import java.util.ArrayList;

public class Iterator {
	  public static void main(String[] args) {
	  
	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	  
	    // Get the iterator
	    java.util.Iterator<String> it = cars.iterator();
	  
	    // Print the first item
	    while(it.hasNext()){
	    System.out.println(it.next());
	    }
	  }
	}
