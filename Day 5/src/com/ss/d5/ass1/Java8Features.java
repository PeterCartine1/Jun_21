/**
 * 
 */
package com.ss.d5.ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author peter
 *
 */
public class Java8Features {

	/**
	 * 
	 */
	public Java8Features() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lambdaArray = new ArrayList<String>();
		lambdaArray.add("Agfregr");
		lambdaArray.add("Brrrw");
		lambdaArray.add("Nbrre");
		lambdaArray.add("Potyjyu");
		lambdaArray.add("Sfsrar");
		lambdaArray.add("Iheawt");
		lambdaArray.add("Esvra");
		lambdaArray.add("agg");
		List<Integer> integerArray = new ArrayList<Integer>();
		integerArray.add(65);
		integerArray.add(34);
		integerArray.add(2);
		integerArray.add(677);
		integerArray.add(25);
		integerArray.add(63);
		integerArray.add(0);
		Java8Features j8f = new Java8Features();
		j8f.sortByLength(lambdaArray);
		j8f.sortByLengthReversed(lambdaArray);
		j8f.sortAlphabetically(lambdaArray);
		j8f.eFirst(lambdaArray);
		j8f.eFirstWStatic(lambdaArray);
		j8f.evenOddStringBuffer(integerArray);
		j8f.threeLetterAs(lambdaArray);
	}
	public List<String> sortByLength(List<String> lambdaArray) {
		lambdaArray.sort((o1, o2) -> Integer.valueOf(((String) o1).length()).compareTo(Integer.valueOf(((String) o2).length())));
		System.out.println(lambdaArray);
		return lambdaArray;
	}

	public List<String> sortByLengthReversed(List<String> lambdaArray) {
		lambdaArray.sort((o1, o2) -> Integer.valueOf(((String) o2).length()).compareTo(Integer.valueOf(((String) o1).length())));
		System.out.println(lambdaArray);
		return lambdaArray;
	}
	
	public List<String> sortAlphabetically(List<String> lambdaArray) {
		lambdaArray.sort((o1, o2) -> ((String) o1).compareTo((String) o2));
		System.out.println(lambdaArray);
		return lambdaArray;
	}
	
	public List<String> eFirst(List<String> lambdaArray) {
		lambdaArray.sort((o1, o2) -> {
			if (String.valueOf(o1.charAt(0)).equals("E")) {
				return -1;
			} else if (String.valueOf(o2.charAt(0)).equals("E")) {
				return 1;
			} else {
				return 0;
			}
		});
		System.out.println(lambdaArray);
		return lambdaArray;
	}
	
	public List<String> eFirstWStatic(List<String> lambdaArray) {
		lambdaArray.sort((o1, o2) -> eFirstStatic(o1, o2));
		System.out.println(lambdaArray);
		return lambdaArray;
	}

	private static int eFirstStatic(String o1, String o2) {
		if (String.valueOf(o1.charAt(0)).equals("E")) {
			return -1;
		} else if (String.valueOf(o2.charAt(0)).equals("E")) {
			return 1;
		} else {
			return 0;
	}
	}
	
	public StringBuffer evenOddStringBuffer(List<Integer> integerArray) {
		StringBuffer sb = new StringBuffer();
		integerArray.forEach(i -> {
			if (i % 2 == 1) {
				sb.append("o" + i + ",");
			} else {
				sb.append("e" + i + ",");
			}
		});
		System.out.println(sb);
		return sb;
	}
	
	public List<String> threeLetterAs(List<String> lambdaArray) {
		lambdaArray = lambdaArray.stream().filter(i -> (i.length() == 3)).filter(i -> String.valueOf(i.charAt(0)).equals("a")).collect(Collectors.toList());
		System.out.println(lambdaArray);
		return lambdaArray;
	}
}
