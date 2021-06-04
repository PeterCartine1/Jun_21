/**
 * 
 */
package com.ss.d3.p1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author peter
 *
 */
public class FileWriterPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriterPractice.runMethod();
	}
	public static void runMethod() {
		String relativePath = "src/com/ss/d3/p1/in.txt";
		try (InputStream in = new FileInputStream(relativePath)) {
//			System.out.println(in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (BufferedReader buf = new BufferedReader(new FileReader(relativePath))) {
			Files.write(Paths.get("src/com/ss/d3/p1/out.txt"),
					buf.readLine().getBytes(), StandardOpenOption.APPEND);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
