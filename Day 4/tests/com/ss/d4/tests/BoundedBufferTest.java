/**
 * 
 */
package com.ss.d4.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ss.d4.ass3.BoundedBuffer;
import com.ss.d4.ass3.Consumer;
import com.ss.d4.ass3.Producer;
import com.ss.d4.ass3.ProducerConsumerRunner;

/**
 * @author peter
 *
 */
class BoundedBufferTest {

	ProducerConsumerRunner pcr1 = new ProducerConsumerRunner();

	@Test
	public void testBufferedArray() {
		assertEquals(1000, pcr1.runBuffer().size());
		for (Integer i : ProducerConsumerRunner.bufferSize) {
			assertTrue(i < 8 & i >= 0);
			assertTrue(i instanceof Integer);
		}
	}

	@Test
	public void testBufferedArray2() {
		assertNotNull(BoundedBuffer.bb);
	}

	@Test
	public void testProducer1() {
		pcr1.runBuffer();
		assertEquals(1000, Producer.counter1);
	}

	@Test
	public void testProducer2() {
		pcr1.runBuffer();
		assertEquals(1000, Producer.counter2);
	}

	@Test
	public void testProducer3() {
		pcr1.runBuffer();
		assertEquals(1000, Producer.counter3);
	}

	@Test
	public void testConsumer1() {
		pcr1.runBuffer();
		assertEquals(1000, Consumer.counter1);
	}

	@Test
	public void testConsumer2() {
		pcr1.runBuffer();
		assertEquals(1000, Consumer.counter2);
	}

	@Test
	public void testConsumer3() {
		pcr1.runBuffer();
		assertEquals(1000, Consumer.counter3);
	}
}