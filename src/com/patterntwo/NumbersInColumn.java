package com.patterntwo;

import java.util.Scanner;

public class NumbersInColumn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print: ");
		int row =sc.nextInt();
		
		for(int i =1;i<=row;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print(" "+p++);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------Pattern 2------------------");
		for(int i =1;i<=row;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=row;j>=i;j--){
				System.out.print(" "+p++);
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------diamond with numbers------------------");
		  for(int i=1;i<row;i++) {
			  int p=1;
        	  for(int j=row;j>=i;j--){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=1;j<i;j++){
        		  System.out.print(" "+p++);
        		  
        	  }
        	  for(int j=1;j<=i;j++){
        		  System.out.print(" "+p++);
        		  
        	  }
        	  System.out.println();
          }
          for(int i=1;i<=row;i++) {
        	  int p=1;
        	  for(int j=1;j<=i;j++){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=row;j>i;j--){
        		  System.out.print(" "+p++);
        		  
        	  }
        	  for(int j=row;j>=i;j--){
        		  System.out.print(" "+p++);
        		  
        	  }
        	  System.out.println();
          }

		System.out.println("-----------------------Pattern 3 starting number varies------------------");
		
		for(int i =1,k=row;i<=row;i++,k--) {
			int p=k;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=row;j>=i;j--){
				System.out.print(" "+p--);
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------HIll pattern------------------");

		for(int i =1;i<=row;i++) {
			int p =1;
			for(int j =row;j>=i;j--){
				System.out.print("  ");
				
			}
			for(int j =1;j<i;j++) {
				System.out.print(" "+p++);
			}
			for(int j =1;j<=i;j++) {
				System.out.print(" "+p--);
			}

			System.out.println();
		}
		
		System.out.println("-----------------------Floyd pattern------------------");
		
		int p=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+p++);
			}
			System.out.println();
		}
	}

}
