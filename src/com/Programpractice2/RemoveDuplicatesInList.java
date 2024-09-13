package com.Programpractice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		List<Object> LL= new LinkedList<Object>();
		
		
		LL.add(1);
		LL.add("a");
		LL.add(2);
		LL.add("a");
		LL.add(2);
		
	HashSet<Object> ss = new HashSet<>();
	for(Object l:LL) {
		ss.add(l);
		
	}
	
	List<Object> uniqueElements= new LinkedList<Object>(ss);
	for(Object u:uniqueElements) {
		System.out.println(u);
	}
	System.out.println("-----------------------Second Largest NUmber-------------");
	int[] number= {222,333,45,76,2456};
//	Arrays.sort(number);
	for(int i=0;i<number.length;i++) {
		for(int j=0;j<number.length;j++) {
			if(number[i]<number[j]) {
				int temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				
			}
			
		}
		
	}
	System.out.println("SEcond Largest Number is: "+number[number.length-2]);
	
	
		

	}

}
