package com.demo.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class FilterExample {

	public static void main(String[] args) {
		//Return instructors having more than 10 years of experience
		List<Instructor> list = Instructors.getAll()
				.stream().filter(s->s.getYearOfExperience()>10)
				.collect(Collectors.toList());
		//System.out.println(instructorlist);
		
		list.forEach(System.out::println);;
		System.out.println("..................");
		
		//Return instructors sorted by there name and having more than 10 years of experience
		List<Instructor> instructorlist1 = Instructors.getAll().stream()
				.filter(i->i.getYearOfExperience() >10)
				.sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());
		
		instructorlist1.forEach(System.out::println);
	}

}
