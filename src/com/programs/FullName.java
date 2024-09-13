package com.programs;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your FullName");
		
		String full_name ="Karthick Mohan";
		
		String sr ="";
		 sr+= full_name.charAt(0);
		 sr+=".";
	//System.out.println(sr);
	
	for(int i=0;i<full_name.length();i++) {
		if(full_name.charAt(i)==' '&& full_name.charAt(i+1)!=' '&& i+1<full_name.length()) {
			//System.out.println( ((Object)full_name.charAt(i+1)).getClass().getSimpleName());
			//sr=(sr+full_name.charAt(i+1)).toUpperCase();
			sr+=Character.toUpperCase(full_name.charAt(i+1));
			sr+=".";
			break;
		}
		
	}
	String last_wrd="";
	for(int j=full_name.length()-1;j>=0;j--) {
		if(full_name.charAt(j)==' ') {
		 // System.out.println(full_name.charAt(j+1)+"----------");
		  last_wrd=full_name.substring(j+1);
		  //System.out.println(last_wrd);
		  break;
		}
		
	}
	
	//sr=sr.substring(0,sr.length()-1);
	sr+=last_wrd;
	
	System.out.println(sr);

	}

}
