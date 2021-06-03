/**
 * 
 */
package com.ss.d2.ass3;

/**
 * class to calculate and display the area of a circle
 *
 */
public class Circle implements Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates instance of circle and calls the display and calculateArea methods
		Circle circle = new Circle();
		circle.display(circle.calculateArea(24.5, 3.14, "ft"));
	}

	@Override
//	abstract method implemented for finding the area of a circle
	public String calculateArea(Double radius, Double pi, String unitOfMeasurement) {
		String area = (String.valueOf(radius * radius * pi)) + unitOfMeasurement + "²";
		return area;
	}

	@Override
	// prints the area of the circle object to the console
	public void display(String area) {
		// TODO Auto-generated method stub
		System.out.println(area);
	}

}
