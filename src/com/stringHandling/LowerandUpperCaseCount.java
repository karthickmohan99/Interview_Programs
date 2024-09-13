package com.stringHandling;

import java.util.Scanner;

public class LowerandUpperCaseCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print the string:");
		String str= sc.nextLine();
		int upperCaseCount=0,loweCaseCount=0 ;
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upperCaseCount++;
			}else if(Character.isLowerCase(str.charAt(i))) {
				loweCaseCount++;
			}
		}
		
		System.out.println("UpperCase: "+upperCaseCount+" and "+"LowerCase: "+loweCaseCount);

	}

}
