package com.stringHandling;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the string:");
		String str= sc.nextLine();
		
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isLowerCase(c)){
				str2+=Character.toUpperCase(c);
			}else if(Character.isUpperCase(c)) {
				str2+=Character.toLowerCase(c);
			}else {
				str2+=c;
			}
		}
		
		System.out.println("Before Swap: "+str);
		System.out.println("After Swap: "+ str2);

	}

}
