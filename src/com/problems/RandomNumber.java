package com.problems;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		
		int count=10;
		while(count>0) {
			//this method generates random integers between 0 included to specified bound(Here it is 100 excluded).
			//+1 is added to generated random number falls within the range from 1 to 100 inclusive
			int randomNumber=random.nextInt(100)+1;
			System.out.println("Random Number "+randomNumber);
			count--;
		}

	}

}
