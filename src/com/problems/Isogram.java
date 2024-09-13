package com.problems;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public static void main(String[] args) {
		boolean result =isIsogram("pen");
        System.out.println(result);
	}
	
	public static boolean isIsogram(String s) {
		boolean isIsogram= true;
		
		char[] chars = s.toCharArray();
		Set<Character> charset=new HashSet<>(); 
		for(char ch:chars) {
			if(charset.contains(ch)) {
				isIsogram=false;
				break;
			}else {
				charset.add(ch);
			}
			
		}
		
		return isIsogram;
		
	}

}
