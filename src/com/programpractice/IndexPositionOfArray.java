package com.programpractice;

import java.util.LinkedList;
import java.util.List;

public class IndexPositionOfArray {

	public static void main(String[] args) {
		
	   int[]numbers = {1,2,3,4,55,66,55,54};
	  List result= indexPosition(numbers,55);
	  System.out.println(result);
	   

	}
	public static List indexPosition(int[]arr,int element) {
		  List ll = new LinkedList<>();
		//int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== element) {
				ll.add(i);
			}
		}
		return ll;
	}
	

}
