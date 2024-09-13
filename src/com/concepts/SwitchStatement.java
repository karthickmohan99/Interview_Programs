package com.concepts;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		System.out.println("Simple Calculator");
		
		Scanner sc=new Scanner(System.in);
		int n =0;
		while(n<2){
			System.out.println("Enter the number:");
			
			
			
			n++;
		}
		
		int x=sc.nextInt();
		
		int y=sc.nextInt();
		
		System.out.println("Press 1 for Addition\nPress 2 for substraction"
				+ "\nPress 3 for Multiplication\nPress 4  for Division");
		int choice=sc.nextInt();
		
		switch(choice) {
		      
		case 1:
			System.out.println("Addition is:"+(x+y));
		     break;
		case 2:
			System.out.println("Substraction is:"+(x-y));
		    break;
		case 3:
			System.out.println("Multiplication is:"+(x*y));
		    break;
		case 4:
			System.out.println("Division is:"+(x/y));
		    break;
		default:
			System.out.println("Wrong choice");
		
		
		}

	}

}
