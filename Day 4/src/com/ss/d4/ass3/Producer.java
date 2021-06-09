package com.ss.d4.ass3;

/**
 * @author peter Thread that adds items into a buffered array
 */
public class Producer extends Thread {
	public static int counter1 = 0;
	public static int counter2 = 0;
	public static int counter3 = 0;

	/**
	 * 
	 */
	public Producer(int i) {
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

	double randNumber = Math.random();
	double d = randNumber * 100;
	int randomInt = (int) d + 1;

	@Override
	public void run() {
		Boolean hasRoom = BoundedBuffer.give(randomInt);
		if (hasRoom.equals(true)) {
			System.out.println("in: " + randomInt);
		}
	}
}