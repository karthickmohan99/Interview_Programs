package com.Programpractice2;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
			
			
		

	}

}
