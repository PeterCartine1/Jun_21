/**
test the Singleton class
 * 
 */
package com.ss.w1.ass2.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ss.w1.ass2.FixedSingleton;

/**
 * @author peter
 *
 */
public class FixedSingletonClassTest {

	@Test
	public void testFirstInstance() {
		FixedSingleton a = FixedSingleton.getInstance();
		FixedSingleton b = FixedSingleton.getInstance();
		assertNotNull(a);
		assertNotNull(b);
		assertTrue(a.equals(b));

	}

}
