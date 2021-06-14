package com.demo.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class FlatMapExample {
	
	public static void main(String[] args) {
		//list of list of courses
		List<List<String>> list =Instructors.getAll().stream()
				.map(Instructor::getCourses).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("........................");
		
		// Get a list of courses which offers by Instructors
		List<String> courseslist = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(courseslist);
		System.out.println("........................");
		
		// Get a Set of courses which offers by Instructors to remove duplicate
				Set<String> courseslistWithoutDuplicate = Instructors.getAll().stream()
						.map(Instructor::getCourses)
						.flatMap(List::stream)
						.collect(Collectors.toSet());
				System.out.println(courseslistWithoutDuplicate);
		
		
		
	
	}
}
