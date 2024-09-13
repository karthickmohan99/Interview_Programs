package com.patterntwo;

import java.util.Scanner;

public class BasicPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("Enter the number of rows to print: ");
	   
	   int row =sc.nextInt();
	   
	   for(int i = 1;i<=row-1;i++) {
		   
		   for(int j =row;j>=i;j--) {
			   System.out.print(" ");
		   }
		   for(int j =1;j<=i;j++) {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
          for(int i = 1;i<=row;i++) {
		   
		   
		   for(int j =1;j<=i;j++) {
			   System.out.print(" ");
		   }
		   for(int j =row;j>=i;j--) {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
          
          
          System.out.println("---------------------------SandGlass-----------------------");
          
          for(int i =1 ;i<row;i++) {
        	  for(int j =1;j<=i;j++) {
        		  System.out.print(" ");
        	  }
        	  for(int j =row;j>=i;j--) {
        		  System.out.print(" *");
        	  }
        	  System.out.println();
          }
          for(int i =1 ;i<=row;i++) {
        	  for(int j =row;j>=i;j--) {
        		  System.out.print(" ");
        	  }
        	  for(int j =1;j<=i;j++) {
        		  System.out.print(" *");
        	  }
        	  System.out.println();
          }
	   
          System.out.println("---------------------------Diamond without pyramid-----------------------");
          
          for(int i=1;i<row;i++) {
        	  for(int j=row;j>=i;j--){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=1;j<i;j++){
        		  System.out.print(" *");
        		  
        	  }
        	  for(int j=1;j<=i;j++){
        		  System.out.print(" *");
        		  
        	  }
        	  System.out.println();
          }
          for(int i=1;i<=row;i++) {
        	  for(int j=1;j<=i;j++){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=row;j>i;j--){
        		  System.out.print(" *");
        		  
        	  }
        	  for(int j=row;j>=i;j--){
        		  System.out.print(" *");
        		  
        	  }
        	  System.out.println();
          }

	}

}
