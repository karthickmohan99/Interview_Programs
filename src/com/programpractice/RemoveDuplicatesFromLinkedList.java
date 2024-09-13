package com.programpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
	   //ArrayList uses array as  an underlying DataStructure
		//fixed in size
		//initial capacity is 10 in arrayList
		//once it reaches the initial capacity it automatically creates a new array with larger capacity
		//it tooks time and resources

		
		LinkedList ll= new LinkedList();//inserting and removing is very faster
		ll.add(1);
		ll.add(2);
		ll.add('e');
		ll.add(3);
		ll.add(3);
		
//		for(Object lists:ll) {
//			System.out.println(lists);
//			
//			
//		}
//		
		LinkedList<Object> afterRemoved= removeDuplicates(ll);
//				for(Object newList:afterRemoved) {
//					System.out.println("After REmove Duplicates"+newList);
//				}
				
				Iterator<Object> it = afterRemoved.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
		
		

	}
	
	public static LinkedList<Object> removeDuplicates(LinkedList<Object> list) {
		
		HashSet<Object> set = new HashSet<>();
		
		for(Object l :list) {
			set.add(l);
			
		}
		
	LinkedList<Object> Newlist = new LinkedList<>(set);
	return Newlist;
		
	}

}
