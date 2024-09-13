package com.programpractice;

import java.util.Scanner;

public class UniqueValueinArray {

	public static void main(String[] args) {
//		int[]arr= {12,23,43,25,65,78,65,23,12};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total length of Array: ");
		int n=sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] uniqueValue = new int[arr.length];
		boolean uniqueValueFound = false;
		int uniqueCount=0;
		for(int i=0;i<arr.length;i++) {
			boolean isRepeated = false;
			for(int j=0;j<arr.length;j++) {
				if(j!=i && arr[i]==arr[j]) {
					isRepeated=true;
				}
			}
			
			if(!isRepeated) {
				uniqueValue[uniqueCount]= arr[i];
				uniqueValueFound=true;
				uniqueCount++;
				
			}
		}
		if(uniqueValueFound) {
			for(int k=0;k<uniqueCount;k++) {
				System.out.println("Unique Values in the arrays are: "+uniqueValue[k]);
			}
			
		}else {
			System.out.println("No unique values found in the array.");
		}

	}

}
