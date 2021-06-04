/**
 * 
 */
package com.ss.d3.ass2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author peter
 *class to append text to an existing file
 */
public class FileWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// assign relativePath of the existing file to a variable
        String relativePath = "src\\com\\ss\\d3\\ass2\\existingfile.txt";
        // assign the text to be appended to a variable
        String text = "Hello";
        try {
        	// writes String text to the file
            Files.write(Paths.get(relativePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
        	// excepting handling
			e.printStackTrace();
        }
	}
}
