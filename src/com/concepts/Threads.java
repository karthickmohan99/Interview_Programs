package com.concepts;

class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread starts running");
	}
	
}

public class Threads {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("Thread Active Count "+Thread.activeCount());
		
		Thread.currentThread().setName("MAIN");
		System.out.println("currentThread Name "+Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println("CurrentTHread Priority "+Thread.currentThread().getPriority());
		System.out.println("CurrentTHread CheckAlive "+Thread.currentThread().isAlive());
		
		System.out.println("check Deamon "+t.isDaemon());
		t.setName("Thread 2");
		System.out.println("New THread Name"+t.getName());

	}

}
