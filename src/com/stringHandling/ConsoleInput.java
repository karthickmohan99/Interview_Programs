package com.stringHandling;

public class ConsoleInput {

	public static void main(String[] args) {
		
		/*
		 * String character = System.console().readLine();
		 * 
		 * System.out.println(character);
		 */
		
		float f1  =23.34f;
		float f2 = 3.34f;
		
		float product = f1*f2;
		System.out.println(product);
		
		//Swap Two numbers
		
		int num1 =23, num2=32;
		
		System.out.println("Before Swapping num1: "+num1+" num2: "+num2);
		/*
		 * num1+=num2;//23+32=55; num2=num1-num2;//55-32=23; num1-=num2;
		 */
		
		//System.out.println("After Swapping num1: "+num1+" num2: "+num2);
		//method 2
		
		num1=(num1+num2)-(num2=num1);//55 -23 //num2=num1 = 23
		System.out.println("After Swapping num1: "+num1+" num2: "+num2);
		
		

	}

}
