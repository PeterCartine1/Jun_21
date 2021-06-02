package com.ss.jb.ass2;

import java.util.Scanner;

public class AssignmentTwo {
	public static void main(String[] args) {
		// Generates a random number
		double randNumber = Math.random();
		double d = randNumber * 100;
		int randomInt = (int) d + 1;
		// Creates a Scanner object
		Scanner scanner = new Scanner(System.in);
		// loops 5 times to give the user 5 chances to guess the number
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number between 1 and 100");
			String guess = scanner.nextLine(); // Read user input
			// makes sure the input can be converted into an Integer
			try {
				Integer guessInt = Integer.valueOf(guess);
				// makes sure the input is between 1 and 100
				if (guessInt < 1 || guessInt > 100) {
					i -= 1;
					System.out.println("Need to input a number between 1-100");
					// checks if input is within 10 of random number
				} else if (Math.abs(randomInt - guessInt) < 11) {
					System.out.println(randomInt);
					break;
					// checks if this is the users last guess
				} else if (i == 4) {
					System.out.println("Sorry " + randomInt);
				} else {
					System.out.println("Keep Guessing");
				}
				// this gives the user another chance if their input wasn't a valid guess
			} catch (Exception err) {
				i -= 1;
				System.out.println("Need to input a number between 1-100");
			}
		}
		// this closes the scanner object to prevent a resource leak
		scanner.close();
	}
}
