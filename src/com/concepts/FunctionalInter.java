package com.concepts;

@FunctionalInterface
interface calc{
	public void add(int a,int b);
	default public void sub(int a,int b) {
		int c=a-b;
		System.out.println("sub "+ c);
	}
}

public class FunctionalInter {

	public static void main(String[] args) {
		//calc c = (int a,int b)->System.out.println("Addition "+(a+b));
		   calc c=FunctionalInter::performAddition;
		                          
		c.add(2, 3);
		c.sub(10,5);
	}

	public static void performAddition(int a,int b) {
		System.out.println("Addition "+(a+b));
	}
}


