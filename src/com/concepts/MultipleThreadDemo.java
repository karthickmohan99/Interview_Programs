package com.concepts;


class D  extends Thread{
	
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

 
 class E extends Thread{
		
		public void run() {
			for(int i =0;i<=10;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
 

public class MultipleThreadDemo {

	public static void main(String[] args) {
	//without multi threading everything goes synchronously once obj executed again it will came back to main method 
	//and Executes obj2
//-----multiThreading 	 runs both object simultaneously	
             D obj = new D();
             E obj1 = new E();
             obj.start();
             
             try {
				obj.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
             
             obj1.start();
             
             System.out.println(Thread.activeCount());
             System.out.println(Thread.currentThread().getName());
             System.out.println(obj.getPriority());
             obj1.setPriority(Thread.MAX_PRIORITY);
//             obj.show();
//             obj1.show();
	}

}
