package com.concepts;

class Synlock {
	
	synchronized public void Show (String msg) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.print("[");
		
		System.out.print(msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
	}
}
class ThreadClass extends Thread{
	String msg;
	Synlock sl;
	 ThreadClass(String msg,Synlock sl) {
		this.msg=msg;
		this.sl=sl;
	}
	
	public void run(){
		sl.Show(msg);
	}
	
}
public class SynchronizedMethod {

	public static void main(String[] args) {
		Synlock s = new Synlock();
		
		ThreadClass thread1 = new ThreadClass("Hi",s);
		thread1.setName("Hi-thread");
		thread1.start();
		try {
			thread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ThreadClass thread2 = new ThreadClass("Hello",s);
		thread2.setName("Hello-thread");
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadClass thread3 = new ThreadClass("How r u ?",s);
		thread3.setName("How-thread");
		thread3.start();
		
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.activeCount());
		

	}

}
