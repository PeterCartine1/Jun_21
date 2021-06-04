/**
 * 
 */
package com.ss.d3.ass1;

import java.io.File;

/**
 * @author peter this class lists all the contents a given directory and all the
 *         sub-directories
 */
public class ListDirectoryContent {

	/**
	 * @param args
	 */
	static void printDirectoryContents(File[] listOfFiles) {
		// loops through list of files parameter and prints each iteration
		for (File e : listOfFiles) {
			System.out.println(e.toString());
			// checks if element is file or directory
			if (e.isDirectory()) {
				// creates object containing list of all the files in sub-directory and prints
				// each element
				File listOfFiles2[] = e.listFiles();
				System.out.println("------------------\nSUBDIRECTORY Contents:");
				for (File f : listOfFiles2) {
					System.out.println(f.toString());
				}
				System.out.println("------------------");
			}
		}
	}

	public static void main(String[] args) {
		// given directory
		String givenDirectory = "C:\\Users\\peter\\peterholdem";
		// creates file object from given directory
		File givenDirectoryObj = new File(givenDirectory);
		// checks if given directory exists on computer and is actually a directory
		if (givenDirectoryObj.isDirectory() && givenDirectoryObj.exists()) {
			// creates object containing list of files in given directory and runs
			// printDirectoryContents method with the file list as a parameter
			File listOfFiles[] = givenDirectoryObj.listFiles();
			System.out.println("DIRECTORY - " + givenDirectory + " Contents:\n------------------");
			printDirectoryContents(listOfFiles);
		}
	}

}
