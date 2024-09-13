package com.concepts;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();
		l1.add(12);
		l1.add(23);
		l1.add(10);
		l1.add(15);
//      List<Integer>sttreamList= new ArrayList<>();
//	  sttreamList= l1.stream().filter((x)->x>=15).collect(Collectors.toList());
//	  sttreamList.stream().forEach(num->System.out.println(num));
	  
//	 Stream s= l1.stream().filter(n->n%2==0); - Return stream
//	 s.forEach(n-> System.out.println(n));-> return stream
		
		l1.stream().filter(n->n%2==0).forEach(n-> System.out.println("Even Values: "+n));
		
		//count
		l1.stream().map(n->n*n).forEach(System.out::println);
		//System.out.println("Count"+s);

		//Sorted
		Stream sort=l1.stream().map(n->n*n).sorted();
		sort.forEach(nu->System.out.println("Ascending Order: "+nu));
		
		//Descending
		
		Stream Descsort=l1.stream().map(n->n*n).sorted((a,b)->b.compareTo(a));
		Descsort.forEach(nu->System.out.println("Descending order: "+nu));
		
		//Min and max
		Integer Min=l1.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("Minimum NUmber: "+Min);
		
		
		Integer Max=l1.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Maximum NUmber: "+Max);
		
		
		//ToArray
		
		Object[] toA=l1.stream().filter(n->n%2==0).toArray();
		
		for(Object x:toA) {
			System.out.println("Array Element From Stream: "+x);
		}
		
		//of method
		
		Stream.of(111,222,333,444).forEach(n->System.out.println("From of Method: "+n));
		String [] str= {"Code","Decode","Demo"};
		Stream.of(str).filter(st->st.length()>4).forEach(s1->System.out.println("array From of mehthod: "+s1));
		
	}

}
