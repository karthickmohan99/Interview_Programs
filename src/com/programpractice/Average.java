package com.programpractice;

public class Average {

	public static void main(String[] args) {
		int num[] = {6,11,18,64,99};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		
		int avg=sum%num.length;
		System.out.println("Average is:"+avg);

	}

}
