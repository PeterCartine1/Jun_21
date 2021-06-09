package com.ss.w1.ass1.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.w1.ass1.Ass1Lambdas;

class Ass1LambdasTest {
	public List<Integer> createList() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(62);
		intList.add(39);
		intList.add(64);
		intList.add(15);
		intList.add(61);
		intList.add(0);
		return intList;
	}

	@Test
	public void test() {
		Ass1Lambdas a1 = new Ass1Lambdas();
		assertEquals(null, isOdd(7));
	}

}
