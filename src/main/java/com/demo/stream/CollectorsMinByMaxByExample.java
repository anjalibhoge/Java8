package com.demo.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class CollectorsMinByMaxByExample {

	public static void main(String[] args) {

		// instructor with minimum years of experience
		Optional<Instructor> instructor = Instructors.getAll().stream()
				.collect(Collectors.minBy(Comparator.comparing(Instructor::getYearOfExperience)));
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		System.out.println(".....................");
		
		instructor = Instructors.getAll().stream().min(Comparator.comparing(Instructor::getYearOfExperience));
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		System.out.println(".....................");

		// instructor with max years of experience
		instructor = Instructors.getAll().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience)));
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		
		instructor = Instructors.getAll().stream().max(Comparator.comparing(Instructor::getYearOfExperience));
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		System.out.println(".....................");
	}
}
