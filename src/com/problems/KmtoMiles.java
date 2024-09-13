package com.problems;

import java.util.Scanner;

public class KmtoMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Kilometer");
		double km =sc.nextDouble();
		
		final double CONVERSION_FACTOR =0.621371;
		
		double miles= km*CONVERSION_FACTOR;
		System.out.println(km+" Kilometers is equal to "+miles+" Miles");
		

	}

}
