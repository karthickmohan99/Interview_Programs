package com.Programpractice2;

import java.util.LinkedList;
import java.util.List;

public class SearchElement {

	public static void main(String[] args) {
	          
		 int[]numbers = {1,2,3,4,55,66,55,54};
		 List result =findIndex(55,numbers);
		 System.out.println(result);
	}
	
	static List findIndex (int element, int[]arr) {
		int index=0;
	List ll=new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==element) {
				
				ll.add(i);
				
			}	
			
		}
		return ll;
		
	}

}
