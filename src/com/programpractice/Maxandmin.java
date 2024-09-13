package com.programpractice;

public class Maxandmin {

	public static void main(String[] args) {
		int[]arr= {1,22,3,4,2,44};
		
		int Max=arr[0];
		int Min=arr[0];
		for(int i=0;i<arr.length;i++) {
			   if(arr[i]<Min) {
				   Min=arr[i];
			   }
			   if(arr[i]>Max) {
				   Max=arr[i];
			   }
		}
		System.out.println("Maximum: "+Max+" and Minimum: "+Min);

	}

}
