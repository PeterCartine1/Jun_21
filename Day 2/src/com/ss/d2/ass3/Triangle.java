/**
 * 
 */
package com.ss.d2.ass3;

/**
 * class to calculate and display the area of a triangle
 *
 */
public class Triangle implements Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates instance of a triangle and calls the display and calculateArea methods
		Triangle triangle = new Triangle();
		triangle.display(triangle.calculateArea(15.0, 200.0, "in"));
	}

	@Override
	// abstract method implemented for finding the area of a triangle
	public String calculateArea(Double width, Double height, String unitOfMeasurement) {
		String area = (String.valueOf((width * height) / 2)) + unitOfMeasurement + "²";
		return area;
	}

	@Override
	// prints the area of the triangle object to the console
	public void display(String area) {
		// TODO Auto-generated method stub
		System.out.println(area);
	}

}
