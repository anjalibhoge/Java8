package com.demo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class StreamMaxExample {

	public static void main(String[] args) {
		// Printing the instructors who has highest years of experience
		Optional instructor = Instructors.getAll().stream().max(Comparator.comparing(Instructor::getYearOfExperience));
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		System.out.println("................");

		// Max using stream max function

		List<Integer> numbers = Arrays.asList(1, 4, 6, 7, 4, 9, 34, 5, 6);

		Optional result = numbers.stream().max(Integer::compareTo);
		if (result.isPresent())
			System.out.println(result.get());
//0+1 - 1
//1+2 -2
//2+3-3

		int result2 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(result2);

		// Issue is when the List is empty still it will provide O(Identity) as a result
		List<Integer> numbers2 = Arrays.asList();
		int result3 = numbers2.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(result3);
		System.out.println("................");

		Optional result4 = numbers2.stream().reduce((a, b) -> a > b ? a : b);
		if (result4.isPresent()) {
			System.out.println(result4.get());
		}
		System.out.println("................");

		Optional result5 = numbers.stream().reduce(Integer::max);
		if (result5.isPresent()) {
			System.out.println(result5.get());
		}
	}

}
