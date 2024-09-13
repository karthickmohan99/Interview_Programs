package com.programpractice;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
//		int arr[][]= {{1,2,3,4},{2,5,7,9},{5,2,8,5}};
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]);
//			}
//		}

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no of Columns:");
		
		int columns =sc.nextInt();
		
		System.out.println("Enter array elements: ");
		
		int arr[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int[]y:arr) {
			//System.out.println("array"+y);
			for(int x:y) {
				System.out.print(x+"  ");
			}
			System.out.println();
		}
	}

}
