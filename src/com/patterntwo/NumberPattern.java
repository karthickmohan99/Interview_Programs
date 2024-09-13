package com.patterntwo;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print: ");
		int row =sc.nextInt();
		
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(" 1");
				
			}
			System.out.println();
		}
	System.out.println("Increasing pattern with numbers");	
		
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(" "+i);
				
			}
			System.out.println();
		}
		
System.out.println("Increasing pattern with numbers method 2");	
		
		for(int i =1, p=1;i<=row;i++,p++) {
			for(int j=1;j<=i;j++){
				System.out.print(" "+p);
				
			}
			System.out.println();
		}
		
System.out.println("Increasing pattern with decrease numbers method 2");	
		
		for(int i =1, p=row;i<=row;i++,p--) {
			for(int j=1;j<=i;j++){
				System.out.print(" "+p);
				
			}
			System.out.println();
		}

System.out.println("Increasing pattern with 0 2 4 6 8 ");	
		
		for(int i =1, p=0;i<=row;i++,p+=2) {
			for(int j=1;j<=i;j++){
				System.out.print(" "+p);
				
			}
			System.out.println();
		}
		
System.out.println("Increasing pattern with Alternate Numbers ");	
		
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++){
				if(i%2==0) {
					System.out.print(" 2");
				}else {
					System.out.print(" 1");
				}
				
				
			}
			System.out.println();
			
		}
		
		System.out.println("Diamond pattern with increased numbers ");	
		int p=1;
		  for(int i=1;i<row;i++,p++) {
        	  for(int j=row;j>=i;j--){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=1;j<i;j++){
        		  System.out.print(" "+p);
        		  
        	  }
        	  for(int j=1;j<=i;j++){
        		  System.out.print(" "+p);
        		  
        	  }
        	  System.out.println();
          }
          for(int i=1;i<=row;i++,p++) {
        	  for(int j=1;j<=i;j++){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=row;j>i;j--){
        		  System.out.print(" "+p);
        		  
        	  }
        	  for(int j=row;j>=i;j--){
        		  System.out.print(" "+p);
        		  
        	  }
        	  System.out.println();
          }

      	System.out.println("Diamond pattern with increased and decreased numbers numbers ");	
		
		  for(int i=1,p1=1;i<row;i++,p1++) {
        	  for(int j=row;j>=i;j--){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=1;j<i;j++){
        		  System.out.print(" "+p1);
        		  
        	  }
        	  for(int j=1;j<=i;j++){
        		  System.out.print(" "+p1);
        		  
        	  }
        	  System.out.println();
          }
          for(int i=1,p1=row;i<=row;i++,p1--) {
        	  for(int j=1;j<=i;j++){
        		  System.out.print("  ");
        		  
        	  }
        	  for(int j=row;j>i;j--){
        		  System.out.print(" "+p1);
        		  
        	  }
        	  for(int j=row;j>=i;j--){
        		  System.out.print(" "+p1);
        		  
        	  }
        	  System.out.println();
          }


	}

}
