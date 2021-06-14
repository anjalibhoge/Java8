package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class JoiningExample {

	public static void main(String[] args) {
		String result =Stream.of("a","n","j","a","l","i").collect(Collectors.joining());
		System.out.println(result);
		
		 result =Stream.of("a","n","j","a","l","i").collect(Collectors.joining(","));
		 System.out.println(result);
		 
		 result =Stream.of("a","n","j","a","l","i").collect(Collectors.joining(",","{","}"));
		 System.out.println(result);
		 System.out.println("........................");
		 
		 
		 //instructor name separated by ' prefix "{" and suffix  "}"
		 String nameOfInstructorConcatanated =Instructors.getAll().stream()
				 .map(Instructor::getName).collect(Collectors.joining(",","{","}"));
		 System.out.println("Name Of All Instructor : "+nameOfInstructorConcatanated);
		 System.out.println("........................");
		 
		 
		String courses =Instructors.getAll().stream()
				 .map(Instructor::getCourses).map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(courses);
		 System.out.println("........................");
		 
		 
		String course = Instructors.getAll().stream().map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.joining(","));
		System.out.println(course);
		 System.out.println("........................");
		 
		List<String> list =Instructors.getAll().stream()
				 .map(Instructor::getCourses).flatMap(List::stream)
				 .collect(Collectors.toList());
		System.out.println(list);
		
		
		List<Character> ch =Arrays.asList('a','n','j','u');
		//convert character list into string
		String chString = ch.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(chString);
				
	}

}
