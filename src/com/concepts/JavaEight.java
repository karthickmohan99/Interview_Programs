package com.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface addNum{
	public int add(int a,int b);
}

public class JavaEight {

	public static void main(String[] args) {
		// Stream
		
		List<Integer> al = new ArrayList<>();
		
		al.add(2);
		al.add(20);
		al.add(56);
		al.add(76);
		
		
		List st_l= al.stream().filter(n->n>50).collect(Collectors.toList());//collect element of stream and add them to new collection
		
		al.stream().map(x->x*x).sorted((a,b)->b.compareTo(a)).forEach(a->System.out.print(a+","));
		       
		st_l.stream().forEach(x->System.out.println(x));
	    
		List<String> lll=Arrays.asList("c++","java","python");
		lll.stream().map(String::toUpperCase).forEach(System.out::println);
		
  List<String> l2=Arrays.asList("c","C++","Java","Spring");
		
	l2.stream().map(j->j).forEach(j->System.out.println("jjjjj"+j));
		
		//Lambda expression(method without name without return and acess modifier)
		
		
		//biconsumer predefined functional interface in java.util.function
		//take 2 integers and return nothing
		BiConsumer<Integer,Integer>bic=(a,b)->System.out.println(a+b);
		bic.accept(1,2);
		
		
		addNum add=(int a,int b)->a+b;
		add.add(2, 4);
		
		
		
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s = "successfully";
		boolean result = isALongWord.test(s);
		
		System.out.println(result);
      
	}
	
	
	

}
