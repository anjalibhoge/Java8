package com.demo.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class PartitioningByExample {

	public static void main(String[] args) {
		// partition in two groups of instructor 1st is
		// greater than years of experience > 10 and 2nd is <= 10

		Predicate<Instructor> experiencedPredicate = instructor -> instructor.getYearOfExperience() > 10;
		Map<Boolean, List<Instructor>> map = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(experiencedPredicate));
		map.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});
		System.out.println("....................");
		
		//partition but return set
		Map<Boolean, Set<Instructor>> map1 = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(experiencedPredicate,Collectors.toSet()));
		map1.forEach((key, value) -> {
			System.out.println("key = " + key + " value = " + value);
		});
	}

}
