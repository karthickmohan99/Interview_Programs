package com.stringHandling;

import java.util.Scanner;

public class CharacterAppearanceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the string:");
		String str= sc.nextLine().toLowerCase();
		int count=0;
		System.out.println("Enter character to check:");
		char charcheck=sc.next().toLowerCase().charAt(0);
		/* char[]c=new char[5]; */
		
		/*
		 * for(int i=0;i<5;i++) { c[i]=sc.next().charAt(0); } for(char ch:c) {
		 * System.out.println("Character array"+ch); }
		 */
		System.out.println(charcheck+"CharCheck");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==charcheck) {
				count++;
			}
		}
		
		System.out.println(count);


	}

}
