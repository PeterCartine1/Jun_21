/**
 * 
 */
package com.ss.d3.ass3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author peter this class counts the number of times a particular character
 *         appears in a file
 */
public class CharacterCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// checks to make sure you input an argument
		if (args.length == 0) {
			System.out.println("input character to count");
		} else {
			// makes sure input is a single character
			if (args[0].length() > 1) {
				System.out.println("Need to input single character");
			} else {
				// int to keep track of each instance of the character
				int counter = 0;
				// casting the first argument from a string to a char
				char charInput = args[0].charAt(0);
				// creating BufferedReader object
				try (BufferedReader buf = new BufferedReader(
						new FileReader("src/com/ss/d3/ass3/characterfinderfile.txt"))) {
					String fileLine = null;
					// looping through each line of the file and each character of the line then
					// increasing the counter every time the character matches the input
					while ((fileLine = buf.readLine()) != null) {
						for (int i = 0; i < fileLine.length(); i++) {
							if (charInput == fileLine.charAt(i)) {
								counter++;
							}
						}
					}
					// exception handling
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// prints the number of times the character appears in the file to the console
					System.out.println(counter);
				}
			}
		}
	}

}
