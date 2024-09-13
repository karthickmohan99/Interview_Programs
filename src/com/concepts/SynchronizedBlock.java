package com.concepts;


class BookingCounter{
	int TicketsAvailable=3;
	
	public void booK(String name,int tickets) {
		if(tickets>=TicketsAvailable &&TicketsAvailable>0) {
			System.out.println(name+" your Ticket is Available");
		}else {
			System.out.println(name+" "+"Ticket is not avilable for you!");
		}
	}
	
	
}

class LockSeat extends Thread {
	 BookingCounter bt;
	 String name;
	 int tickets;
	LockSeat(String name, int tickets,BookingCounter bt){
		this.bt=bt;
		this.name=name;
		this.tickets=tickets;
	}
	
	public void run() {
		synchronized(bt) {
			bt.booK(name, tickets);
		}
	}
	
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		BookingCounter t = new BookingCounter();
		LockSeat  ls = new LockSeat("Karthick",1,t);
		LockSeat  ls2 = new LockSeat("surya",4,t);
		ls.start();
		ls2.start();
         ls.setPriority(Thread.MAX_PRIORITY);
	}

}
