package com.Programpractice2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 10;
		
		for(int i =2;i<=num;i++) {
			
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}
			if(isPrime) {
				System.out.println(i+" is prime number");
			}
			
			
		}
		
		System.out.println("-------------method 2--------");
		
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println("given number is not a prime");
				break;
			}else {
				System.out.println("Given number is a prime");
				break;
			}
		}
		
		System.out.println("-------------method 3--------");
		
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is prime ");
			
			
		}else {
			System.out.println("Given number is not a prime");
		}
		
		

	}

}
