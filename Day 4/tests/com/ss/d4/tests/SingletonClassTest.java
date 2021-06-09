/**
test the Singleton class
 * 
 */
package com.ss.d4.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ss.d4.ass1.SingletonClass;

/**
 * @author peter
 *
 */
public class SingletonClassTest {

	@Test
	public void testFirstInstance() {
		SingletonClass a = SingletonClass.getInstance();
		SingletonClass b = SingletonClass.getInstance();
		assertNotNull(a);
		assertNotNull(b);
		assertTrue(a.equals(b));

	}

}
