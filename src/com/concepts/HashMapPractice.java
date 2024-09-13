package com.concepts;

import java.util.Map;

import java.util.Hashtable;
import java.util.HashMap;
public class HashMapPractice {

	public static void main(String[] args) {
		//HashMap<Integer,String> hm = new HashMap<Integer,String>();
	   HashMap<Integer,String> m= new HashMap<>();
           m.put(1, "a");
           m.put(1,"b" );
           m.put(2,"c" );
           m.put(1, null);
           m.put(2, null);
          System.out.println();
           m.put(3,  m.remove(2));
           m.put(2, null);
           m.replace(2,"c");
           m.put(null, "d");
           m.put(null, "e");
           System.out.println(m.get(1));
           System.out.println(m.values());
           System.out.println(m.entrySet());
           
           Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
           ht.put(1,"a");
           ht.put(2, null);
           
           System.out.println("HashTable"+ht.entrySet());
	}

}
