package com.programpractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNumber =0,SecondNumber=1;
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Any number:");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++) {
	  System.out.print(firstNumber);
	    int nextNumber=firstNumber+SecondNumber;
	    firstNumber=SecondNumber;
	    SecondNumber=nextNumber;
  }
  
  
	}

}
