package com.Programpractice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OddandEvenInLL {

	public static void main(String[] args) {
		List<Integer> odd= new LinkedList<Integer>();
		List<Integer> even= new LinkedList<Integer>();
		
		int[]arr= {1,3,45,32,34,5,7,9};
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		
		Iterator itr =odd.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
