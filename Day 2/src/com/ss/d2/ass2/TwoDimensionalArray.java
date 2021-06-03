/**
 * 
 */
package com.ss.d2.ass2;

import java.util.Arrays;

/**
 * This class is for randomly generating a 2D array and finding the index of the
 * biggest number in it
 *
 */
public class TwoDimensionalArray {
	public static void main(String[] args) {
		// generates a random number of rows between 1 and 16
		Integer arrayRows = (int) (Math.random() * 100 / 7) + 1;
		// generates a random number of columns between 1 and 16
		Integer arrayColumns = (int) (Math.random() * 100 / 7) + 1;
		// creates a variable to represent the biggest number in the array, set to 0
		// since the array hasn't been made yet
		Double biggestNumber = 0.0;
		// creates a variable that will hold the index of the biggest number
		Integer[] biggestNumberIndex = new Integer[2];
		// creates a 2D array with the randomly selected number of rows and columns all
		// containing null values
		Double[][] twoDimensionalArray = new Double[arrayRows][arrayColumns];
		// for loop to assign random values to each index in the array
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				Double newValue = Math.random() * 100;
				twoDimensionalArray[i][j] = newValue;
				// conditional to make biggestNumber equal to the newValue if newValue is bigger
				// than biggestNumber and to find the index of the new biggest number
				if (newValue > biggestNumber) {
					biggestNumber = newValue;
					biggestNumberIndex[0] = i;
					biggestNumberIndex[1] = j;
				}
			}
		}
		// print statement to show the 2D array using a for loop to format it nicely,
		// would also work using:
		// System.out.println(Arrays.deepToString(twoDimensionalArray));
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			System.out.println(Arrays.toString(twoDimensionalArray[i]));
		}
		// prints the max value and it's position in the array
		System.out.println(biggestNumber);
		System.out.println(Arrays.toString(biggestNumberIndex));
	}
}
