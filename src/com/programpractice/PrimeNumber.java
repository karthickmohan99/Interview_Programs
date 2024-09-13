package com.programpractice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		
		if(count ==2) {
		   System.out.println("prime Number");
		}
		else {
			 System.out.println("Not a prime Number");
		}
	}

}
