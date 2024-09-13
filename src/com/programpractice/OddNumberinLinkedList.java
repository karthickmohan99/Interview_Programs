package com.programpractice;

import java.util.LinkedList;

public class OddNumberinLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,3,45,32,34,5,7,9};
		LinkedList<Integer>ll=new LinkedList<>();
		LinkedList<Integer>ll1=new LinkedList<>();
       
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				ll.add(arr[i]);
			}
			else {
				ll1.add(arr[i]);
			}
		}
		for(int x:ll) {
			System.out.println(x);
		}
		
		for(int x:ll1) {
			System.out.println("even Numbers: "+x);
		}
		

	}

}
