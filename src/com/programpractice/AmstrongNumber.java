package com.programpractice;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		
		int n=371,originalNumber,remainder,result=0;
	    originalNumber=n;
		String strnum = Integer.toString(n);
		int len = strnum.length();
		System.out.println("Length"+len);
		while(n!=0) {
			remainder = n%10;//gives remainder
			result+=Math.pow(remainder,len );//sum of all digits raised to the power of number of digits  
			n/=10;//gives quotiennt
		}
		
		if(result == originalNumber) {
			System.out.println("Given number is amstrong num");
		}
		else {
			System.out.println("Given number is not an amstrong num");
		}

	}

}
