package org.jp.java8.feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortCourseString {

	public static void main(String[] args) {
		List<String> courseList = Arrays.asList("Kubernetes", "Python", "Docker", null, "Spring Boot", null, "Spring",
				"AWS", "Angular", null);

		// sort in asc order & print the courses
		courseList.stream().filter(Objects::nonNull).sorted().forEach(System.out::println);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		// sort in desc order & print the courses
		courseList.stream().filter(Objects::nonNull).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
		// sort the string on the basis of string length in asc order
		courseList.stream().filter(Objects::nonNull).sorted(Comparator.comparing(String::length))
				.forEach(System.out::println);
		// sort the string on the basis of string length in desc order
		System.out.println("************************");
		courseList.stream().filter(Objects::nonNull)
				.sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).forEach(System.out::println);
		// group course name based on course length
		System.out.println(courseList.stream().filter(Objects::nonNull)
				.collect(Collectors.groupingBy(String::length, Collectors.toList())));

		// find max string using natural order comparator
		System.out.println(courseList.stream().filter(Objects::nonNull).max(Comparator.naturalOrder()));
		// find max string using reverse order comparator
		System.out.println(courseList.stream().filter(Objects::nonNull).min(Comparator.reverseOrder()));
		// find string wth max string length using natural order comparator
		System.out.println(courseList.stream().filter(Objects::nonNull).max(Comparator.comparing(String::length)));

	}
}
