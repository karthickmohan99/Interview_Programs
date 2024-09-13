package com.Programpractice2;

public class UniqueValue {

	public static void main(String[] args) {
		int[] arrayy= {22,22,33,44,5,56,7,6};
		
		int[] uniqueArr=new int[arrayy.length];
		int uniqueCount=0;
		boolean uniqueValueFound=false;
		for(int i =0;i<arrayy.length;i++) {
			boolean Repeated=false;
			for(int j=0;j<arrayy.length;j++) {
				
				if(i!=j&&arrayy[i]==arrayy[j]){   
		
					
			
					Repeated=true;
					
				}
				
				
			}
			if(!Repeated) {
				
				uniqueArr[uniqueCount]=arrayy[i];
				uniqueCount++;
				uniqueValueFound=true;
			}
		}
		
		if(uniqueValueFound) {
			for(int k=0;k<uniqueCount;k++) {
				System.out.println(uniqueArr[k]);
			}
		}
		
		

	}

}
