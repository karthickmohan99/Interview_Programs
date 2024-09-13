package com.Programpractice2;

import java.util.Arrays;

public class Amstrong {

	public static void main(String[] args) {
		
		
//		int n=371,remainder,originalNumber,result=0;
//		originalNumber =n;
//		String str= Integer.toString(originalNumber);
//		int len =str.length();
//		while(n!=0){
//			remainder=n%10;
//			result+=Math.pow(remainder, len);
//			n/=10;
//			
//			System.out.println(n+" "+"n value");
//			
//			
//		}
//		
//		if(originalNumber == result) {
//			System.out.println("given number is amstron number");
//		}else {
//			System.out.println("Given number is not an amstrong number");
//		}

		System.out.println("-------Average--------");
		
		int avnum=12354;
		String numstr = String.valueOf(avnum);
		
		/* System.out.println(numstr+"num String"); */
		  System.out.println(numstr.length()+" "+"length of num");
		 
		int [] numArr = new int[numstr.length()];
		int sum=0;
		for(int i=0;i<numstr.length();i++) {
			/* System.out.println(i); */
			/* System.out.print(numstr.charAt(i)+"char at string"); */
			numArr[i]=Character.getNumericValue(numstr.charAt(i));
			
		}
		
		for(int el:numArr) {
		sum+=el;
		}
		System.out.println(sum+"sum");
		int avg=sum/numArr.length;
		System.out.println(avg+"average");
		
	}

}
