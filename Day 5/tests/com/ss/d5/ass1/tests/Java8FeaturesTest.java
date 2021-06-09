package com.ss.d5.ass1.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.d5.ass1.Java8Features;

class Java8FeaturesTest {

	public static List<String> createStringArray() {
		List<String> lambdaArray = new ArrayList<String>();
		lambdaArray.add("Agfregr");
		lambdaArray.add("Brrrw");
		lambdaArray.add("Nbrre");
		lambdaArray.add("Potyjyu");
		lambdaArray.add("Sfsrar");
		lambdaArray.add("Iheawt");
		lambdaArray.add("Esvra");
		lambdaArray.add("agg");
		return lambdaArray;
	}

	public static List<Integer> createIntegerArray() {
		List<Integer> integerArray = new ArrayList<Integer>();
		integerArray.add(65);
		integerArray.add(34);
		integerArray.add(2);
		integerArray.add(677);
		integerArray.add(25);
		integerArray.add(63);
		integerArray.add(0);
		return integerArray;
	}

	@Test
	public void testSortByLength() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "agg", "Brrrw", "Nbrre", "Esvra", "Sfsrar", "Iheawt", "Agfregr", "Potyjyu");
		assertLinesMatch(a, j8f.sortByLength(createStringArray()));
	}

	@Test
	public void testSortByLengthReversed() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "Agfregr", "Potyjyu", "Sfsrar", "Iheawt", "Brrrw", "Nbrre", "Esvra", "agg");
		assertLinesMatch(a, j8f.sortByLengthReversed(createStringArray()));
	}

	@Test
	public void testSortAlphabetically() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "Agfregr", "Brrrw", "Esvra", "Iheawt", "Nbrre", "Potyjyu", "Sfsrar", "agg");
		assertLinesMatch(a, j8f.sortAlphabetically(createStringArray()));
	}

	@Test
	public void testEFirst() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "Esvra", "Agfregr", "Brrrw", "Nbrre", "Potyjyu", "Sfsrar", "Iheawt", "agg");
		assertLinesMatch(a, j8f.eFirst(createStringArray()));
	}

	@Test
	public void testEFirstWStatic() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "Esvra", "Agfregr", "Brrrw", "Nbrre", "Potyjyu", "Sfsrar", "Iheawt", "agg");
		assertLinesMatch(a, j8f.eFirstWStatic(createStringArray()));
	}

	@Test
	public void testEvenOddStringBuffer() {
		Java8Features j8f = new Java8Features();
		StringBuffer a = new StringBuffer();
		a.append("o65,e34,e2,o677,o25,o63,e0,");
		assertEquals(a.toString(), j8f.evenOddStringBuffer(createIntegerArray()).toString());
	}

	@Test
	public void testThreeLetterAs() {
		Java8Features j8f = new Java8Features();
		List<String> a = new ArrayList<>();
		Collections.addAll(a, "agg");
		assertLinesMatch(a, j8f.threeLetterAs(createStringArray()));
	}

}
