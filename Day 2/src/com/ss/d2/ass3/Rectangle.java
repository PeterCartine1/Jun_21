/**
 * 
 */
package com.ss.d2.ass3;

/**
 * class to calculate and display the area of a rectangle
 *
 */
public class Rectangle implements Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates instance of a rectangle and calls the display and calculateArea methods
		Rectangle rectangle = new Rectangle();
		rectangle.display(rectangle.calculateArea(15.0, 200.0, "in"));
	}

	@Override
//	abstract method implemented for finding the area of a rectangle
	public String calculateArea(Double width, Double height, String unitOfMeasurement) {
		String area = (String.valueOf(width * height)) + unitOfMeasurement + "²";
		return area;
	}

	@Override
	// prints the area of the rectangle object to the console
	public void display(String area) {
		// TODO Auto-generated method stub
		System.out.println(area);
	}

}
