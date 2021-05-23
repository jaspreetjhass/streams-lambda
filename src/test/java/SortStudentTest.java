
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jp.java8.model.Challenge;
import org.jp.java8.model.Student;
import org.junit.Assert;
import org.junit.Test;

public class SortStudentTest {

	@Test
	public void sortStudentByNameAndAgeAndRating() {
		List<Student> studentList = Arrays.asList(new Student("tom", 34, "usa", new Challenge("geeks for geek", 3.4)),
				new Student("garry", 34, "usa", new Challenge("geeks for geek", 3.5)),
				new Student("lisa", 25, "ireland", new Challenge("hacker-rank", 4.9)),
				new Student("arsh", 30, "india", new Challenge("leet-code", 1.5)),
				new Student("jackie", 31, "south africa", new Challenge("geeks for geek", 3.1)),
				new Student("garry", 34, "uk", new Challenge("leet code", 3.7)),
				new Student("jennifer", 29, "germany", new Challenge("geeks for geek", 3.8)),
				new Student("johnson", 45, "canada", new Challenge("geeks for geek", 4.4)),
				new Student("david", 25, "canada", new Challenge("hacker-rank", 2.4)));

		List<Student> output = studentList.stream()
				.sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge, Comparator.reverseOrder())
						.thenComparing(s -> s.getChallenge().getRating(), Comparator.reverseOrder()))
				.collect(Collectors.toList());

		List<String> expectedNameList = Arrays.asList("arsh", "david", "garry", "garry", "jackie", "jennifer",
				"johnson", "lisa", "tom");
		List<String> sortedNameList = output.stream().map(Student::getName).collect(Collectors.toList());

		Assert.assertArrayEquals(expectedNameList.toArray(), sortedNameList.toArray());
		MatcherAssert.assertThat(output.get(2).getChallenge().getRating(), is(3.7));
		MatcherAssert.assertThat(output.get(4).getAge(), is(31));
		
		MatcherAssert.assertThat(expectedNameList, Matchers.contains(sortedNameList.toArray()));

	}

}
