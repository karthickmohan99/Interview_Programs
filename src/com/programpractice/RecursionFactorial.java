package com.programpractice;

public class RecursionFactorial {

	public static void main(String[] args) {
		System.out.println(recursion(10));

	}
	
    static int recursion(int n) {
    	if(n!=0) {
    		return n*recursion(n-1);
    	}else {
    		return 1;
    	}
    	
    }

}
