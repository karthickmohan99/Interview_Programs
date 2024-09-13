package com.programpractice;

public class NumberSwap {

	public static void main(String[] args) {
		int a =19;
		int b=23;
//		 System.out.println("Before Swapping a:"+a+"and b:"+b);
//		int temp = a;
//	    a=b;
//	    b=temp;
//	    System.out.println("After Swapping a:"+a+"and b:"+b);
	    
	    System.out.println("Without third variable");
	    System.out.println("Before Swapping a:"+a+"and b:"+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	   
	    System.out.println("After Swapping a:"+a+"and b:"+b);
	    
	    System.out.println("String Swap");
	    
	    String a1= "abc";
	    String b1 ="bca";
//	    System.out.println("Before Swapping a1:"+a1+" and b1:"+b1);
//	    String temp =a1;
//	    a1=b1;
//	    b1=temp;
//	    System.out.println("After Swapping a1: "+a1+" and b1: "+b1);
//	    
	    System.out.println("Before Swapping a1:"+a1+" and b1:"+b1);
	    a1=a1+b1;
	    b1=a1.substring(0,a1.length()-b1.length());
	    a1=a1.substring(b1.length());
	    System.out.println("After Swapping a1: "+a1+" and b1: "+b1);
	    

	}

}
