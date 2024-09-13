package com.programpractice;

import java.util.Arrays;

public class SecondLargestValue {

	public static void main(String[] args) {
		 
		int[] number= {222,333,45,76,2456};
        
		for(int i=0;i<number.length;i++) {
			
			for(int j=0;j<number.length;j++) {
				
				if(number[i]<number[j]) {
					int temp =number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			
		}
		//Arrays.sort(number);
		for(int x:number) {
			System.out.print(x+",");
			
		}
		System.out.println("Second Largest number"+number[number.length-2]);
	}

}
