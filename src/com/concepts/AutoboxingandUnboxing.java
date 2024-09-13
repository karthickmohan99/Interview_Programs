package com.concepts;

import java.util.ArrayList;

public class AutoboxingandUnboxing {

	public static void main(String[] args) {
		
		char ch ='a';
		
		//Auto Boxing
		Character chara = ch ;
		
		///unboxing
		
		char c = chara;
		
		ArrayList <Integer>al = new ArrayList<>();
		al.add(24);
		
		//unBoxing
		int n = al.get(0);
		
		System.out.println(n);
		

	}

}
