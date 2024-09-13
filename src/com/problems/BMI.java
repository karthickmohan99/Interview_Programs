package com.problems;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your weight in Kg: ");
	   double weight =sc.nextDouble();
	   
	   System.out.println("Enter your height in meters: ");
	   double height =sc.nextDouble();
	   
	   double BMI = weight/(height*height);
	   
	   System.out.println("BMI: "+BMI);
	   

	}

}
