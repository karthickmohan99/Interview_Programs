package com.number;

public class HarshadNumber {

	public static void main(String[] args) {
		//Harshad /naiven which is divisible by sum of its digits 
		
		int num=156;
		int m=num;
		int sum=0;
		while(num!=0) {
			int d = num%10;
			sum+=d;
			num/=10;
		}
		
		if(m%sum==0){
			System.out.println("this is Harshad number");
		}else {
			System.out.println("this is not a Harshad number");	
		}
		


	}

}
