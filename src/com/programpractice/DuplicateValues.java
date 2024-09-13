package com.programpractice;

public class DuplicateValues {

	public static void main(String[] args) {
		int arr[] = {1,22,3,44,33,22,44,5};
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			for(int j = i+1;j<arr.length;j++) {
				//System.out.println(arr[i]+"------- "+arr[j]);
				if(arr[i]==arr[j]) {
					System.out.println("Duplicated Values are"+arr[i]);
				}
				
			}
			
		}
		
		
//		for(int num:arr) {
//			System.out.println(num);
//			
//		}

	}

}



