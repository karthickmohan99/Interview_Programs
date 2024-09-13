package com.number;

public class SpyNumber {

	public static void main(String[] args) {
		//sum of digits equal to product of digits
		
		
		int num=123;
		int m=num;
		int sum=0,prod=1;
		while(num!=0) {
			int d = num%10;
			sum=sum+d;
			prod=prod*d;
			num/=10;
		}
		System.out.println(sum+"-------"+prod);
		if(sum==prod) {
			System.out.println("this is spy number");
		}else {
			System.out.println("this is not a spy number");	
		}
		

	}

}
