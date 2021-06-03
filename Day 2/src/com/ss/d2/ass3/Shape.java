/**
 * 
 */
package com.ss.d2.ass3;

/**
 * This instance is for implementing the abstract methods calculateArea() and
 * display() to subclasses
 *
 */
public interface Shape {
	// creating the abstract methods that will be overridden/implemented in the child classes
	public String calculateArea(Double width, Double height, String unitOfMeasurement);

	public void display(String area);

}
