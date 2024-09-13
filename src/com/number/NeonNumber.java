package com.number;

public class NeonNumber {

	public static void main(String[] args) {
		// addition of digits in square of number is equal to number
		
		int num=9;
		int m=num;
		int sum=0;num*=num;
		while(num!=0) {
			int d = num%10;
			sum+=d;
			num/=10;
		}
		System.out.println(sum+"-------"+m);
		if(sum == m){
			System.out.println("this is Neon number");
		}else {
			System.out.println("this is not a Neon number");	
		}
		


	}

}
