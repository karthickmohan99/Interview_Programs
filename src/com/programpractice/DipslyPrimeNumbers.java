package com.programpractice;

public class DipslyPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num=10;
             
             for(int i=2;i<=num;i++) {
            	 //System.out.println("i :"+i);
            	 boolean isPrime =true;
            	 for(int j=2;j<=i/2;j++) {
            		 //System.out.println("j :"+j);
            		 if(i%j==0) {
            			 isPrime=false;
            			 break;
            		 }
            	 }
            	 if(isPrime) {
            		 System.out.println(i+" is Prime");
            	 }
             }
	}

}
