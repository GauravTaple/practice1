package com.reldyn.collection_framework.lmbda_Expression;

public class Lambda_Expression3 {
	public static void main(String[] args) {
		int width = 10;
// without lambda expression------
//		Lambda_Expression2 b = new Lambda_Expression2() {
//
//			@Override
//			public void drawable() {
//				System.out.println("it is drawable class "+width);
//			}
//		};
//		b.drawable();
		
		
// with lambda expression-----------
//		Lambda_Expression2 b1 = () -> {
//			System.out.println("Drawing " + width);
//
//		};
//		b1.drawable();
		
		
		//lambda function using multiple parameters
		Lambda_Expression2 b2=(int a,int b)->(a+b);
				{
			System.out.println(b2.inserting(100, 200));
				}

	}

}
