package com.demo.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class StreamExample {

	public static void main(String[] args) {

		//map of name and course of instructor who teaches online have more than 10 years of experience

		Predicate<Instructor> p1 =(i)->i.isOnlineCourses();
		Predicate<Instructor> p2 =(i)->i.getYearOfExperience() >10;
		
		List<Instructor> list = Instructors.getAll();
		Map<String,List<String>> map =list.stream()
					.filter(p1)
					.filter(p2)
					.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		
		 System.out.println(map);
		
		
	}

}
