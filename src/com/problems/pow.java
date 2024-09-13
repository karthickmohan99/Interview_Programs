package com.problems;

import java.util.Scanner;

public class pow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base (a): ");
		double a= sc.nextDouble();
		
		System.out.println("Enter the Exponent (b): ");
		double b= sc.nextDouble();
		
		double result = Math.pow(a, b);
		System.out.println(a+" Raisd to the power of "+ b +" is :"+result);
		

	}

}
