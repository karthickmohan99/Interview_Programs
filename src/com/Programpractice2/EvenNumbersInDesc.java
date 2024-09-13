package com.Programpractice2;

import java.util.Arrays;
import java.util.Collections;

public class EvenNumbersInDesc {

	public static void main(String[] args) {
		
		
		int evenCount=0;
		Integer []evennum = new Integer[25];
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				
				evennum[evenCount]=i;
				evenCount++;
				
			}
		}
		
//		for(int e:evennum) {
//			System.out.print(e+" ;");
//		}
         
		
		Arrays.sort(evennum,Collections.reverseOrder());
		
		for(Integer x:evennum) {
			System.out.print(x+" ");
		}
	}

}
