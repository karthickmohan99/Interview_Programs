package com.stringHandling;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the string:");
		String str1= sc.next();
		
		String str= str1.toLowerCase();
		
		int alpha =256;//number of  possible values for characters in ascii ;
		int[] count= new int[alpha];
		
		for(int i=0;i<str.length();i++) {
			/* System.out.println("counttt"+ ++count[(int)str.charAt(i)]); */
			 count[(int)str.charAt(i)]++; 
			
		}
		
		for(int i=0;i<alpha;i++){
			if(count[i]!=0) {
				System.out.println((char) i + " occurred for: " + count[i]);
			}
			
		}
		
//			for(int x:count) {
//				System.out.print(x);
//			}
			
		
		
		
	}

}
