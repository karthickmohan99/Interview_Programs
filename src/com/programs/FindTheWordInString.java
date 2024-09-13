package com.programs;

public class FindTheWordInString {

	public static void main(String[] args) {
		String stt="This is orange juice";
		String word="orange";
		int indexx= stt.indexOf(word);

		
		//converting string in to char array
//		char[] chh= new char[word.length()];
//		for(int i =0;i<word.length();i++) {
//			chh[i]=word.charAt(i);
//		}
		char[] chh=word.toCharArray();
		
		if(indexx!=-1) {
			for(int i=0;i<chh.length;i++) {
				
				if(chh[i] == stt.charAt(indexx)) {
					System.out.println("The given word-->"+stt.charAt(indexx)+" is found at the index of "+indexx);
					indexx++;
				}
			}
		}else {
			System.out.println("word not found");
		}
		
		
		
      
	}

}
