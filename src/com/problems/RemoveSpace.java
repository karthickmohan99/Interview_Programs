package com.problems;

public class RemoveSpace {

	public static void main(String[] args) {
		String s="hjh jkj          e";
		
		StringBuilder sb = new StringBuilder(s.charAt(0));
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ') {
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
