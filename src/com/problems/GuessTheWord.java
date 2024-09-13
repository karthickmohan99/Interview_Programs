package com.problems;

import java.util.Scanner;

public class GuessTheWord {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter  your secret word:");
		String word = "Karthi";
		String guess= "";
		int  guessCount=0,guessLimit=3;
		boolean outOfGuesses=false;
		while(!guess.equals(word) && !outOfGuesses) {
			if(guessCount<guessLimit)
			{
				System.out.println("Enter your letter guess");
				guess=sc.nextLine();
				guessCount++;
			}else 
			{
				outOfGuesses=true;
			}
			
		}
		if(outOfGuesses) {
			System.out.println("You Lose! No more guessess");
		}else {
			System.out.println("You Win!");
		}
		
		
		
		
		
		
		
                
	}

}
