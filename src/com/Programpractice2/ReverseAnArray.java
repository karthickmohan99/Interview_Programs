package com.Programpractice2;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] evennum = {5, 3, 8, 2, 9};
		
		Arrays.sort(evennum);
		
		
		  
		 
		
		for(int i=evennum.length-1;i>=0;i--) {
			System.out.print(evennum[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("-------Factorial-----");
		
		int factnum = 4;
		int factorial =1;
		for(int i=1;i<=factnum;i++) {
			factorial*=i;
		}
		
		System.out.println("Factorial of "+factnum+"is: "+factorial);
		

		System.out.println("---------------------Factorial-------------------------");
		
		  System.out.println("recursion "+factrec(5));
		  
		  
		

	}
	
	static int  factrec(int n) {
		if(n!=0)
		return n *factrec(n-1);
		else
		return 1;
	}

}
