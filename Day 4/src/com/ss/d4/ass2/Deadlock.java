/**
 * 
 */
package com.ss.d4.ass2;

/**
 * @author peter
 *This class is just supposed to create a deadlock
 */
public class Deadlock extends Thread {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movie m1 = new Movie("Scarface", 1983, 8.2f);
		Movie m2 = new Movie("Goodfellas", 1974, 9.3f);
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (m1) {
					try {
						Thread.sleep(1000);
						synchronized (m2) {
							System.out.println("No Deadlock");
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (m2) {
					try {
						Thread.sleep(1000);
						synchronized (m1) {
							System.out.println("No Deadlock");
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
		System.out.println("Over");
	}

}
