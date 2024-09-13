package com.concepts;

class Bank {
	
	int amount =20000;
	public void withdraw(int amount) {
		System.out.println("Going to  withdraw ....");
		if(amount>this.amount ) {
			System.out.println("Low balance"+"/n"+"Wait until deposit notification");
			
			try {
				wait();//thread is wait for notification(certain condition to be satisfied)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Your withdrawl amount is:"+amount);
		
	}
	
	public void Deposite(int amount) {
		System.out.println("Going to deposite...");
		this.amount+=amount;
		System.out.println(amount+"Amount deposites");
		notify();
	}
}

class t extends Thread{
	int amount;
	Bank b;
	 t(int amount,Bank b){
		 this.amount=amount;
		 this.b=b;
	 }
	 
	 public void run(){
		 b.Deposite(amount);
	 }
}
class t2 extends Thread{
	int amount;
	Bank b;
	 t2(int amount,Bank b){
		 this.amount=amount;
		 this.b=b;
	 }
	 
	 public void run(){
		 b.withdraw(amount);
	 }
}
public class WaitNotify {

	public static void main(String[] args) {
		Bank b = new Bank();
		t thread1 = new t(100000,b);
		thread1.start();
		t2 thread2 = new t2(40000,b);
		thread2.start();

	}

}
