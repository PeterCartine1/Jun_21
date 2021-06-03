/**
 * 
 */
package com.ss.d2.ass1;

/**
 * Class designed to add up all the arguments that are numbers and ignore all
 * other arguments
 *
 */
public class AddArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring a Double variable to represent the sum set to 0 since it hasn't
		// added anything up yet
		Double sum = 0.0;
		// creating a StringBuilder object since any argument passed in that isn't a
		// number is going to be added to this string to let the user know which
		// arguments weren't valid and therefore weren't added
		StringBuilder sb = new StringBuilder();
		// this is a for loop to go over each argument and determine if it is a number
		// or not
		for (int i = 0; i < args.length; i++) {
			// try statement to try and convert the argument into a Double
			try {
				Double isDouble = Double.valueOf(args[i]);
				// if able to be converted into a Double then value added to sum
				sum += isDouble;
				// catches exception if argument cannot be converted into a Double and adds the
				// String to the StringBuilder Object
			} catch (Exception e) {
				sb.append(args[i]).append(" ");
			}
		}
		// adds a message to the StringBuilder object to let the user know which
		// argument/arguments weren't accepted
		if (sb.length() > 1) {
			sb.append("- are not valid numbers and therefore cannot be added");
		} else if (sb.length() > 0) {
			sb.append("- is not a valid number and therefore cannot be added");
		}
		// prints out the sum and the string letting the user know which arguments
		// weren't accepted
		System.out.println(sum);
		System.out.println(sb.toString());
	}
}