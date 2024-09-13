package com.Programpractice2;

public class TenPrimeNumbers {

	public static void main(String[] args) {
		int count =0,n=2;
		
		while(count<10){
			if(findPrime(n))
			{
				count++;
				System.out.println(n);
			}
			
			n++;
		}
		
		findPrime(n);
		
		
	}
	
	static boolean findPrime(int n){
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				isPrime=false;
				return isPrime;
				//System.out.println(n+" is not prime number");
			
			}
				
		}
		return isPrime;
		//System.out.println(n);

		
			
	}
	
	

}
