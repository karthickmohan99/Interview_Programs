package com.problems;

import java.util.Scanner;

public class HeightinFeetandInches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height in centimeters: ");
		double heightInCm= sc.nextDouble();
		
		double inchesInCm=1/2.54;
		
		double heightInInches = heightInCm * inchesInCm;
		
		int feet=(int) (heightInInches/12);
		double remainingInches = heightInInches/12;
		
		System.out.println("Height in feet and Inches: "+feet+"feet, "+remainingInches+" inches");

	}

}
