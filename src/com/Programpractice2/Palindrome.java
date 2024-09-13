package com.Programpractice2;

public class Palindrome {

	public static void main(String[] args) {
		String rev="",str="madama";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
			
		}
		
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("Given String is a palindrome");
		}else {
			System.out.println("Givem STring is not a palindrome");
		}
		

	}

}
