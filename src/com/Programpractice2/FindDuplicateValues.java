package com.Programpractice2;

public class FindDuplicateValues {

	public static void main(String[] args) {
		int[] numArr= {11,22,3,4,77,3,4};
		for(int i=0;i<numArr.length;i++) {
          for(int j=i+1;j<numArr.length;j++) {			
        	 
        	  if(numArr[i]==numArr[j]) {
        		  System.out.println("Duplicate Value is"+numArr[i]);
        		  
        	  }
          }
		}

	}

}