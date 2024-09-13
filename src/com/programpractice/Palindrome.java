package com.programpractice;

public class Palindrome {

	public static void main(String[] args) {
		String str="madama";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+= str.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not a palindrome");
		}
			
	System.out.println("----------------------Number Palindrome");
	
	int n =101,revnum=0,originalNum,remainder;
	originalNum=n;
	
	while(n!=0) {
		remainder=n%10; //lat digit
		
		revnum=revnum*10+remainder;
		n/=10;//remove last digit
	}
	if(revnum ==originalNum ) {
		System.out.println("Given number is Palindrome");
	}else
		System.out.println("Given number is not a Palindrome");

	}

}
