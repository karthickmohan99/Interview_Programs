package com.Programpractice2;

public class MaxandMin {

	public static void main(String[] args){
		int[]arr= {1,22,3,4,2,44};
		int min =arr[0],max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		
		System.out.println("Maximum: "+max+"  minimum: "+min);
		
		System.out.println("Number Swap+");
       int a=10 ,b=5;
       
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After Swap a: "+a+" b: "+b);
       
       System.out.println("-------------------String Swap-------------------------------");
		
       String str1="abc",str2="xyz";
       str1=str1+str2;
       str2=str1.substring(0,str1.length()-str2.length());
       str1=str1.substring(str2.length());
       
       System.out.println("After Swap str1: "+str1+" str1: "+str2);
		
	}

}
