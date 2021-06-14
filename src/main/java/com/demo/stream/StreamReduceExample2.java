package com.demo.stream;

import java.util.Optional;
import com.demo.pojo.Instructors;

public class StreamReduceExample2 {

	public static void main(String[] args) {
		// Printing the instructors who has highest years of experience
		Optional instructor = Instructors.getAll().stream()
				.reduce((a, b) -> a.getYearOfExperience() > b.getYearOfExperience() ? a : b);
		if (instructor.isPresent())
			System.out.println(instructor.get());
		System.out.println("...........................");

		Optional instructor1 = Instructors.getAll().stream().reduce((a, b) -> {
			if (a.getYearOfExperience() > b.getYearOfExperience()) {
				return a;
			} else {
				return b;
			}
		});

		if (instructor1.isPresent())
			System.out.println(instructor.get());

	}
}
