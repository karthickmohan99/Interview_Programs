package com.programs;

import java.util.HashMap;
import java.util.Map;

public class FindTheOccsurence {

	public static void main(String[] args) {
		//String stt = "welcome to the program that program the code to the welcome";
		//String []string_array =stt.split(" ");
		
		String sc="aabjjhskhaa" ;
//		for(String a :string_array) {
//			System.out.println(a);
//		}
		HashMap<Character,Integer> hm = new HashMap<>();
		int count;
		for(int i=0;i<sc.length();i++) {
		    if(hm.containsKey(sc.charAt(i))) {
		        count = hm.get(sc.charAt(i));
		        hm.put(sc.charAt(i), ++count);
		    }else {
		    	hm.put(sc.charAt(i), 1);
		    }
		}
		System.out.println(hm);
		
		//System.out.println(hm.values());
		int max=0;
		for(int e :hm.values()) {
			if(e>max) {
				max=e;
			}
		}
         System.out.println("maximum"+max);
         
         for(Map.Entry entry:hm.entrySet()) {
        	 if(entry.getValue()== (Integer)max) {
        		 System.out.println("alphabet with maximum occurrence: "+entry.getKey()+"="+entry.getValue());
        	 }
        	 
         }
	}
	
	

}
