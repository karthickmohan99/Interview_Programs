package com.stringHandling;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the string:");
		String str= sc.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			
				int asciiVal=str.charAt(i);
				System.out.println(str.charAt(i)+":"+asciiVal);
			
		}
		
		

	}

}
