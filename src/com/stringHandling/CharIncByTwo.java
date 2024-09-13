package com.stringHandling;

import java.util.Scanner;

public class CharIncByTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the string:");
		String str= sc.next();
		
		
		for(int i=0;i<str.length();i++) {
			
				int asciiVal=str.charAt(i)+2;//implicit type casting 
				System.out.println(str.charAt(i)+":"+(char)asciiVal);//explicit type casting
			
		}
		

	}

}
