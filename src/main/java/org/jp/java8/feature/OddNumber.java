package org.jp.java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OddNumber {

	public static void main(final String[] args) {
		final List<Integer> numberList = Arrays.asList(13, 45, 12, 2, 34, 64, 4, 3);
		final Predicate<Integer> predicate = num -> num % 2 != 0;
		calculateOddNumber(numberList, predicate);
	}

	private static void calculateOddNumber(final List<Integer> numberList, final Predicate<Integer> predicate) {
		numberList.stream().filter(predicate).forEach(System.out::println);
	}

}
