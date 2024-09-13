package com.programpractice;

import java.util.Arrays;
import java.util.Collections;

public class EvenNUmbersInDescendingOrder {

	public static void main(String[] args) {
		int evenCount =0;
		Integer []even= new Integer[25];
           for(int i=1;i<=50;i++) {
			
			       if(i%2==0) {
			    	  
 		    	   even[evenCount]=i;
 		    	   evenCount+=1;
			            }
		           }
            Arrays.sort(even,Collections.reverseOrder());
           for(Integer e:even) {
        	   System.out.print(e+", ");
           }
         //.intValue() used to convert Integer to int
           
	}

}
