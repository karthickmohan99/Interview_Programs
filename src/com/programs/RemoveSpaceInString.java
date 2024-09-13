package com.programs;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String st ="         hjhhkkj  kjkjjjll   ";
		
		int startIndex=0;
		
		while(startIndex>=0 && Character.isWhitespace(st.charAt(startIndex))) {
			startIndex++;
		}
		System.out.println(st.charAt(startIndex)+" "+"Character Check");
		
		
		int endIndex=st.length()-1;
		
		while(endIndex>startIndex && Character.isWhitespace(st.charAt(endIndex))) {
			endIndex--;
		}
		System.out.println(st.charAt(endIndex)+" "+"Character Check at End Index");
		
		String sub_str = st.substring(startIndex, endIndex+1); 
		System.out.println(sub_str+""+"----String without leading and trailing space----");
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<sub_str.length();i++) {
			if(sub_str.charAt(i)!=' ') {
				sb.append(sub_str.charAt(i));
			}
		}
		System.out.println("--String Without Any space--"+sb.toString());
		
		
	}

}
