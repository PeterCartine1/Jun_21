/**
 * 
 */
package com.ss.d4.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ss.d4.ass4.Line;

/**
 * @author peter
 *
 */
public class LineTests {

	Line testLine = new Line(3.4, 5.2, 6.7, 2.0);
	Line testLine2 = new Line(4.1, 43.4, -12.1, -14.0);

	@Test
	public void testGetSlope() {
		assertEquals(-0.969, testLine.getSlope(), 0.01);
	}

	@Test
	public void testGetDistance() {
		assertEquals(4.596, testLine.getDistance(), 0.01);
	}

	@Test
	public void testParallelTo() {
		assertEquals(false, testLine.parallelTo(testLine2));
	}
}
