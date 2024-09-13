package com.programs;

public class RemoveConsonents {

	public static void main(String[] args) {
		 String st ="Hello, have a good day";
		 String new_st="";
		 for(int i=0;i<st.length();i++) {
			 char ch=st.charAt(i);
			 
			 if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				 System.out.println(ch+"---");
				 //new_st = st.replace(ch, "");
				 new_st+=ch;
			 }
		 }
		 
		 System.out.println("String Without Consonants: "+new_st);
		
//		 String st = "Hello, have a good day";
//	        String new_st = "";
//
//	        for (int i = 0; i < st.length(); i++) {
//	            char ch = st.charAt(i);
//
//	            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != ' ') {
//	                new_st += ch;
//	            }
//	        }
//
//	        System.out.println("String Without Consonants: " + new_st);

	}

}
