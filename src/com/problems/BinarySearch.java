package com.problems;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {22,34,23,167,678};
		int num=34,low=0, high=arr.length-1,result=-1;
      
//		for(int i =low;i<=high;i++ ) {
//			int mid = (low+high)/2;
//			
//			if(num ==arr[mid]) {
//				result=mid;
//				break;
//			}else if(num<arr[mid]){
//				high=mid-1;
//			}else if(num >arr[mid]) {
//				low=mid+1;
//			}
//		}
		
		while(low<=high) {
        int mid = (low+high)/2;
			System.out.println(mid);
			if(num ==arr[mid]) {
				result=mid;
				break;
			}else if(arr[mid]<num){
				low=mid+1;
			}else if(arr[mid]>num) {
				high=mid-1;
			}
		}
		
		System.out.println(result);
		if(result>=0) {
			System.out.println("index position of "+num+" is: "+result);
		}else {
			System.out.println("NO matches Found");
		}
		
	}

}
