package com.number;

public class DuckNumber {

	public static void main(String[] args) {
		// Duck number is which has zero its digits
		int num=592;
		int m=num;
		int count=0;
		while(num!=0) {
			int d = num%10;
			if(d==0)count++;
			num/=10;
		}
		
		if(count>0){
			System.out.println("this is Duck number");
		}else {
			System.out.println("this is not a Duck number");	
		}
		

	}

}
