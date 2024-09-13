package com.lt;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row =4,column =4;
		int[][] mm=new int[row][row];
		
		for(int i=0;i<row;i++) {
			for(int j =0;j<column;j++) {
				System.out.println(String.format("Enter mm[%d][%d] integer", row, column));
				mm[i][j]=sc.nextInt();
			}
		}
		for(int r=0;r<mm.length;r++) {
			for(int c=0;c<mm[0].length;c++) {
				System.out.print(mm[r][c]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
//			for(int r=0;r<mm[0].length;r++) {					
//				
//					int temp =mm[r][0];
//					mm[r][0]=mm[r][mm.length-1];
//					mm[r][mm.length-1]=temp;					
//				
//				
//			}
//			
			for(int r=0;r<mm[0].length;r++) {					
				
				int temp =mm[0][r];
				mm[0][r]=mm[mm.length-1][r];
				mm[mm.length-1][r]=temp;					
			
			
		}
			System.out.println("-----------After Swap---------------");
			
			for(int r=0;r<mm.length;r++) {
				for(int c=0;c<mm[0].length;c++) {
					System.out.print(mm[r][c]+"\t");
				}
				System.out.println();
			}
		}

	}


