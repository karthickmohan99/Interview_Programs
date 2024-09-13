package com.number;

public class KrishnaMoorthyNumber {

	public static void main(String[] args) {
		//145 =1! +4! +5!
		
		int num=145;
		int m=num;
		int sum=0;
		while(num!=0) {
			int d = num%10;
			int fact=1;
			for(int i=1;i<=d;i++) {
				fact*=i;
			}
			sum+=fact;
			num/=10; 
			
		}
		
		if(sum==m){
			System.out.println("this is  KM number");
		}else {
			System.out.println("this is not a KM number");	
		}
		

	}

}
