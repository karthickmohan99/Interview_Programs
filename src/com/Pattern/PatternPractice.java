package com.Pattern;

public class PatternPractice {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}

		System.out.println("----------decreased-------------------");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		System.out.println("----------Pyramid-------------------");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println("----------ButterFly-------------------");
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println("----------left pascal-------------------");
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println("----------Right pascal-------------------");
		
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
