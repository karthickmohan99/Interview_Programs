package com.stringHandling;

public class VowelCount {

	public static void main(String[] args) {
		String str="whjdhewdioeuioeficnbbuibgl";
		String vowelString="aeiou";
		char[]charr= new char[str.length()];
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=0; j<vowelString.length();j++) {
			    if(str.charAt(i)==vowelString.charAt(j)) {  
			    	charr[count]=str.charAt(i);
			    	count++;
			    }
			}
			
		}
		for(int k=0;k<count;k++) {
			System.out.println("count: "+count+" Vowel: "+charr[k]);
		}
		
		

	}

}
