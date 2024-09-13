package com.number;

public class AutomorphicNumber {

	public static void main(String[] args) {
		//A number which is contained in the last digit of its square
		
		int num=25;
		int m=num;
		int flag=0,q=num*num;
		while(num!=0) {
			int d = num%10;
			int d1 = q%10;
			if(d != d1)flag=1;
			num/=10; 
			q/=10;
		}
		
		if(flag==0){
			System.out.println("this is  AutomorphicNumber number");
		}else {
			System.out.println("this is not a AutomorphicNumber number");	
		}

	}

}
