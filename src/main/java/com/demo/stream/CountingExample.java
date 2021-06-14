package com.demo.stream;

import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class CountingExample {

	public static void main(String[] args) {
		//count the no of instructors who teaches online courses
		//stream.count
		long count =Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses).count();
		System.out.println(count);
		
		//collectors.counting
		count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.collect(Collectors.counting());
		System.out.println(count);
		
		
	}

}
