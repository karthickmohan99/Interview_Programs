package com.concepts;


class Table extends Thread {
	
	int n;
	public Table(int n) {
	  this.n =n;	
	}
	
	public void run(){
		for(int i=1;i<=10;i++) {
			System.out.println("Table is"+n*i);
			
		}
		System.out.println("-----------------------------------");
	}
	
	
}

public class MultiThreadJoin {

	public static void main(String[] args) {
		
		Table t1=new Table(2);
		
		Table t2=new Table(3);
		Table t3=new Table(4);
		t1.start();
		t3.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		 
	}

}
