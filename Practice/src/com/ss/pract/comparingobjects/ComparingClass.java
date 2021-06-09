package com.ss.pract.comparingobjects;

import java.util.ArrayList;
import java.util.List;

public class ComparingClass {

	public static void main(String[] args) {
		Movies m1 = new Movies("Scarface", 1983, 8.9f);
		Movies m2 = new Movies("Godfather", 1994, 9.3f);
		Movies m3 = new Movies("Goodfellas", 1979, 9.5f);
		Movies m4 = new Movies("Pulp Fiction", 2003, 3.9f);		
		List<Movies> myMovies = new ArrayList<>();
		myMovies.add(m1);
		myMovies.add(m2);
		myMovies.add(m3);
		myMovies.add(m4);
		System.out.println("Before Sort");
		for(Movies m: myMovies) {
			System.out.println(m.toString());
		}
	}

}
