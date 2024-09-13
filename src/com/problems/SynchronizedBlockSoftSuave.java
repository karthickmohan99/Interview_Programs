package com.problems;

public class SynchronizedBlockSoftSuave {

	public static void main(String[] args) {
		StringBuilder a = new  StringBuilder ();
		StringBuilder b = new  StringBuilder ();
		new Thread() {
			public void run() {
				System.out.print(a.append("a"));
				synchronized(a) {
					System.out.print(b.append("b"));
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.print(b.append("c"));
				synchronized(b) {
					System.out.print(a.append("d"));
				}
			}
		}.start();

	}

}
