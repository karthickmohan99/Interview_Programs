package com.problems;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {22,34,23,167,678};
		int num=678,result=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
			    result=i;
			}
			
		}
		
		if(result>=0) {
			System.out.println("index position of "+num+" is: "+result);
		}else {
			System.out.println("NO matches Found");
		}

	}

}
