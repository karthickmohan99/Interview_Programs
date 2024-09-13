package com.Programpractice2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num =10,n1=0,n2=1,next;
		
		for(int i=1;i<num;i++) {
			System.out.print(n1);
			next=n1+n2;
			n1=n2;
			n2=next;
		}
		
		
		System.out.println("----------------Fibonacci Series with recursion-----------------");
		
		for(int i=1;i<num;i++) {
			System.out.print(fib(i));
			
		}
		

	}
	
	static int fib(int n){
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

}
