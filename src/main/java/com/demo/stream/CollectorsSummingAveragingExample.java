package com.demo.stream;

import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class CollectorsSummingAveragingExample {

	public static void main(String[] args) {
		// sum of years of experience of all instructors
		int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearOfExperience));
		System.out.println(sum);
		System.out.println("..........................");
		
		double  average = Instructors.getAll()
				.stream().collect(Collectors.averagingInt(Instructor::getYearOfExperience));
		System.out.println(average);

	}
}
