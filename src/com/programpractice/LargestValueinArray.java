package com.programpractice;

import java.util.Arrays;
public class LargestValueinArray {

	public static void main(String[] args) {
		int[]num = {12,34,4,3,56,7};
		String result =largestValue(num);
		System.out.println(result);
		//largestValue(num);

	}
	
	public static String largestValue(int[]num) {
		
		String[] numstr = new String[num.length];
		for(int i=0;i<num.length;i++) {
		numstr[i]=String.valueOf(num[i]);
			//System.out.println(String.valueOf(num[i]));
		}
		
		Arrays.sort(numstr,(a,b)->(b+a).compareTo(a+b));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<numstr.length;i++) {
			sb.append(numstr[i]);
		}
		
		
		
		return sb.toString();
		
		
	}

}
