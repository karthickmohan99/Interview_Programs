package com.concepts;


class SharedResources{
	boolean valueSet = false;
	int num;
	public synchronized void put(int num)   {
	      while(valueSet) {
	    	  try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	      }
		
		System.out.println("value  produced: "+num);
		this.num=num;
		valueSet=true;
		notify();
	}
	
	public synchronized void get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Value consumed: "+num);
		valueSet=false;
		notify();
	}
}


class Producer implements Runnable{
	
	SharedResources sr;
	    public Producer(SharedResources sr) {
	          this.sr=sr;	
	          Thread t1=new Thread(this);
	          t1.start();
	    }
   
	@Override
	public void run() {
		int n=0;
		while(true) {
			sr.put(++n);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
}

class Consumer implements Runnable{
	SharedResources sr;
	
	public Consumer(SharedResources sr) {
		this.sr=sr;
		Thread t2 = new Thread(this);
		t2.start();
	}
	@Override
	public void run() {
		 while(true) {
			 sr.get(); 
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
		 }
		
	}
	
	
	
}

public class InterThread {

	public static void main(String[] args) {
		SharedResources t = new SharedResources();
		new Producer(t);
		new Consumer(t);

	}

}
