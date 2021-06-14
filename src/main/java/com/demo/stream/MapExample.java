package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class MapExample {

	public static void main(String[] args) {
//return only instructor names from instructor list
		List<String> instructorNames = Instructors.getAll().stream()
										.map(Instructor::getName)
										.map(String::toLowerCase)
										.collect(Collectors.toList());
		System.out.println(instructorNames);
		
	}

}
