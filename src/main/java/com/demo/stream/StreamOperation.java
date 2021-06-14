package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class StreamOperation {

	public static void main(String[] args) {
		//count
		Long count = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.count();
		System.out.println(count);
		System.out.println(".......................");
		
		//distinct courses
		List<String> courseslist = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(courseslist);
		System.out.println(".......................");
		
		//anyMatch  
		boolean anymatch = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.anyMatch(s ->s.startsWith("M"));
		System.out.println(anymatch);
		System.out.println(".......................");
		
		//allMatch
		boolean allMatch = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.allMatch(s ->s.startsWith("M"));
		System.out.println(allMatch);
		System.out.println(".......................");
		
		//noneMatch
		boolean noneMatch = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.noneMatch(s ->s.startsWith("M"));
		System.out.println(noneMatch);
		System.out.println(".......................");
		
	}

}
