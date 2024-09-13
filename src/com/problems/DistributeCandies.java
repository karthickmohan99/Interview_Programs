package com.problems;

public class DistributeCandies {

	public static void main(String[] args) {
	
		int[] ratings = {1,2,2};
	    int[]chocolates=new int[ratings.length];
	    int totalCandies=0;
	    
	    
	    for (int i =0;i<ratings.length;i++) {
	    	
	    	chocolates[i]=1;
	    }
	    
	    for(int i =0;i<ratings.length-1;i++) {
	    	if(ratings[i]>ratings[i+1]) {
	    		chocolates[i]=chocolates[i+1]+1;  
	    	}
	    	
	    }
	                    
	    for(int i=ratings.length-1;i>0;i--) {
	    	if(ratings[i]>ratings[i-1]) {
	    		chocolates[i]=chocolates[i-1]+1; 
	    	}
	    	
	    }
	    
	   for(int x:chocolates) {
		   //System.out.println("chocolates: "+x);
		   totalCandies+=x;
	   }
	   
	   System.out.println("Total candies requires to distribute: "+totalCandies);
	   }

}
