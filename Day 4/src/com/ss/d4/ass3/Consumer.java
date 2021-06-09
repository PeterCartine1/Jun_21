/**
 * 
 */
package com.ss.d4.ass3;

/**
 * @author peter Thread that adds items into a buffered array
 */
public class Consumer extends Thread {
	public static int counter1 = 0;
	public static int counter2 = 0;
	public static int counter3 = 0;
	/**
	 * 
	 */
	public Consumer(int i) {
		super();
		switch (i) {
		case 1:
			counter1++;
			break;
		case 2:
			counter2++;
			break;
		case 3:
			counter3++;
		}
	}
	Integer i = BoundedBuffer.take();

	@Override
	public void run() {
		synchronized (i) {
			if (i != -1) {
				System.out.println(i);
			}
		}
	}
}