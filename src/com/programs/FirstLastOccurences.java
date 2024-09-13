package com.programs;

public class FirstLastOccurences {

	public static void main(String[] args) {
		String myStr = "Hello World";
		int firstOccurence = myStr.indexOf("o");
		int lastOccurence = myStr.lastIndexOf("o");
		//myStr.lastIndexOf("e", 5 it counts backward from index 5
	    System.out.println("firstOccurence of o: "+firstOccurence+"\n"+"lastOccurence of o: "+lastOccurence);
	    
	    //method 2
	    int first_index =-1, last_index=-1;
	    for(int i=0;i<myStr.length();i++){
	    	if(myStr.charAt(i)=='o') {
	    		first_index=i;
	    		break;
	    	}
	    	
	    }
	    
	    for(int j=myStr.length()-1;j>=0;j--) {
	    	System.out.println(j+" "+myStr.charAt(j));
	    	if(myStr.charAt(j)=='o') {
	    		last_index=j;
	    		break;
	    	}
	    }
	    
	    System.out.println("firstOccurence of o: "+first_index+"\n"+"lastOccurence of o: "+last_index);

	}

}
