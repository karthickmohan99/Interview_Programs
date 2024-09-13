package com.problems;

import java.util.LinkedList;
import java.util.List;

public class checkListOnlyContainOdd {

	public static void main(String[] args) {
		List<Integer>ll=new LinkedList<>();
		ll.add(2);
		ll.add(2);
		ll.add(2);
		boolean onlyOdd=true;
		for(Integer x:ll) {
			if(x%2==0) {
				onlyOdd=false;
				break;
			}
			
		}
		
		if(onlyOdd) {
			System.out.println("list of integers contains only odd numbers");
		}else {
			System.out.println("even numbers includes");
		}

	}

}
