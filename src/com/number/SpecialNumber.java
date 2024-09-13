package com.number;

public class SpecialNumber {

	public static void main(String[] args) {
		//sum of digits plus product of digits is equal to original number
		
		int num=592;
		int m=num;
		int sum=0,prod=1;
		while(num!=0) {
			int d = num%10;
			sum=sum+d;
			prod=prod*d;
			num/=10;
		}
		System.out.println(sum+"-------"+prod+"= "+(sum+prod));
		if(sum+prod == m){
			System.out.println("this is special number");
		}else {
			System.out.println("this is not a special number");	
		}
		

		

	}

}
