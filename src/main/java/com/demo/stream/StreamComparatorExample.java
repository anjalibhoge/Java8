package com.demo.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		//Returning all instructors sorted by there name
		List<Instructor> list =Instructors.getAll().stream()
				.sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("..........................");
		
		//Returning all instructors sorted by there name in reverse order
		list= Instructors.getAll().stream()
				.sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("..........................");
		
		//compare by name and then title
		
		list= Instructors.getAll().stream()
				.sorted(Comparator.comparing(Instructor::getName).thenComparing(Instructor::getTitle))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
