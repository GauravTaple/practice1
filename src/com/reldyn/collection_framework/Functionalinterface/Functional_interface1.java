package com.reldyn.collection_framework.Functionalinterface;

public class Functional_interface1 implements Functional_interface {

	@Override
	public void Say() {
		System.out.println("Override say method");
		
	}
	
	public static void main(String[] args) {
		Functional_interface1 b=new Functional_interface1();
		b.Say();
	}

	@Override
	public int squqreit(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
