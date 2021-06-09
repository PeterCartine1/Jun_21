/**
 * 
 */
package com.ss.w1.ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author peter
 *
 */
public class Ass1Lambdas {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(62);
		intList.add(39);
		intList.add(64);
		intList.add(15);
		intList.add(61);
		intList.add(0);
		Ass1Lambdas a1 = new Ass1Lambdas();
		System.out.println(a1.recursion(intList, 105));
	}

	public PerformOperation isOdd() {
		return x -> (x % 2 == 1) ? "ODD" : "EVEN";
	}

	public PerformOperation isPrime() {
		return x -> {
			if (x == 2) {
				return "PRIME";
			}
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					return "NOT PRIME";
				}
			}
			return "PRIME";
		};
	}

	public PerformOperation isPalendrome() {
		StringBuffer sb = new StringBuffer();
		return x -> {
			for (int a = String.valueOf(x).length() - 1; a >= 0; a--) {
				sb.append(String.valueOf(x).charAt(a));
			}
			Integer reverseInt = Integer.parseInt(String.valueOf(sb));
			reverseInt = Integer.valueOf(reverseInt);
			return (x == reverseInt) ? "PALINDROME" : "NOT PALINDROME";
		};
	}

	public List<Integer> rightDigit(List<Integer> l) {
		List<Integer> rightDigitList = l.stream().map(x -> x % 10).collect(Collectors.toList());
		return rightDigitList;
	}

	public List<Integer> doubling(List<Integer> l) {
		List<Integer> doubledList = l.stream().map(x -> x * 2).collect(Collectors.toList());
		return doubledList;
	}

	public List<String> removeX(List<String> l) {
		List<String> noXList = l.stream().map(x -> x.replace("x", "")).collect(Collectors.toList());
		return noXList;
	}

	public boolean recursion(List<Integer> l, int i) {
		l.sort((o1, o2) -> o1 - o2);
		List<Integer> adjList = new ArrayList<>();
		for (int a = 0; a < l.size(); a++) {
			int freq = Collections.frequency(l, l.get(a));
			adjList.add(l.get(a) * freq);
			a += freq - 1;
		}
		if (recursion2(adjList, i, 0) == true) {
			return true;
		}
		return false;
	}

	public boolean recursion2(List<Integer> l, int i, int x) {
		for (int a = 0; a < l.size(); a++) {
			if (l.get(a) + x == i) {
				return true;
			} else {
				if (l.size() > 2) {
					int g = l.get(a);
					l.remove(a);
					boolean result = recursion2(l, i, g + x);
					l.add(a, g);
					if (result == true) {
						return true;
					}
				}
			}

		}
		return false;
	}
}