package com.Programpractice2;

import java.util.Arrays;

public class LargestValueInArray {

	public static void main(String[] args) {
		int[]num = {12,34,4,3,56,7};
        
		String[] numstr=new String[num.length];
		for(int i=0;i<num.length;i++) {
			numstr[i]=String.valueOf(num[i]);
			
		}
		
		//if you sort the array as strings, the custom comparator ensures that the concatenation of the strings forms the largest number possible.
		//If you directly sort the array {12, 34, 4, 3, 56, 7}, you might get {3, 4, 7, 12, 34, 56}
		Arrays.sort(numstr,(a,b)->(b+a).compareTo(a+b));//To concatenate numbers as string we convert num arr in to str array
		
		
		StringBuilder sb = new StringBuilder();
		
		for(String nm:numstr) {
			
			sb.append(nm);
			
		}
		
		System.out.println(sb.toString());
		

	}

}
