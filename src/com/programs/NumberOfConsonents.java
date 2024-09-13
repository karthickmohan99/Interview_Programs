package com.programs;

public class NumberOfConsonents {

	public static void main(String[] args) {
		String input="Hello World! 123";
		
		int vowels=0,consonents=0,digits=0,whitespaces=0;
		
		for(int i=0;i<input.length();i++) {
			char ch =input.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonents++;
				}
			}
			else if(ch>='0'||ch<='9'){
				digits++;
			}else if(ch==' ') {
				whitespaces++;
			}
		}
		
		System.out.println("Number of vowels: " + vowels+"\n"+"Number of consonants: " + consonents+"\n"+"Number of digits: " + digits+"\n"+"Number of whitespace characters: " + whitespaces);
        

	}

}
