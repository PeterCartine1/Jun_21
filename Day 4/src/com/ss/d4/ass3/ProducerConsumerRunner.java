/**
 * 
 */
package com.ss.d4.ass3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peter
 *
 */
public class ProducerConsumerRunner {
	public static List<Integer> bufferSize = new ArrayList<Integer>();
	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		ProducerConsumerRunner pcr = new ProducerConsumerRunner();
		pcr.runBuffer();
	}

	public List<Integer> runBuffer() {
		Producer.counter1 = 0;
		Producer.counter2 = 0;
		Producer.counter3 = 0;
		Consumer.counter1 = 0;
		Consumer.counter2 = 0;
		Consumer.counter3 = 0;
		bufferSize.removeAll(bufferSize);
		for (int i = 0; i < 1000; i++) {
			System.out.println(bufferSize.size());
			Producer p1 = new Producer(1);
			p1.start();
			Consumer c1 = new Consumer(1);
			c1.start();
			Producer p2 = new Producer(2);
			p2.start();
			Consumer c2 = new Consumer(2);
			c2.start();
			Producer p3 = new Producer(3);
			p3.start();
			Consumer c3 = new Consumer(3);
			c3.start();
			bufferSize.add(BoundedBuffer.bb.size());
		}
		System.out.println(bufferSize.size());
		System.out.println("-----> " + Producer.counter1);
		return bufferSize;
	}
}