package org.jp.java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SquareEvenNumber {

	public static void main(final String[] args) {
		final List<Integer> numberList = Arrays.asList(13, 45, 12, 2, 34, 64, 4, 3);
		final Predicate<Integer> predicate = num -> num % 2 == 0;
		final Function<Integer, Integer> function = num -> num * num;
		calculateEvenNumSquare(numberList, predicate, function);
	}

	private static void calculateEvenNumSquare(final List<Integer> numberList, final Predicate<Integer> predicate,
			final Function<Integer, Integer> function) {
		numberList.stream().filter(predicate).map(function).forEach(System.out::println);
	}

}
