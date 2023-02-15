package com.reldyn.collection_framework.methodReferences;

public class Method_Reference1 {
	public static void saySomething()
	{
		System.out.println("saySomething Method");
	}
	public static void main(String[] args) {
		Thread thread=new Thread(Method_Reference1::saySomething);
		thread.start();
	}

}
