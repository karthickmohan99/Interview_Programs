package com.problems;

public class RemoveLeadingandTrailingSpace {

	public static void main(String[] args) {
		String s ="               abc  def                ";
		 //System.out.println(Character.isWhitespace(s.charAt(0)));
//		s=s.strip();
//		System.out.println(s);
		
		//remove leading spaces
		int startIndex =0;
		while(startIndex>=0 && Character.isWhitespace(s.charAt(startIndex))) {
			
			startIndex++;
			
		}
		
		int endIndex =s.length()-1;
		
		while(endIndex>startIndex && Character.isWhitespace(s.charAt(startIndex))) {
			endIndex--;
		}
		
		String trimmedString = s.substring(startIndex,endIndex+1);
		
		System.out.println("Trimmed String is:"+trimmedString);

	}

}
