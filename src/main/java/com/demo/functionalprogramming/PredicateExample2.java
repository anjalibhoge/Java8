package com.demo.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class PredicateExample2 {

	public static void main(String[] args) {
		//instructor who teaches online
		
		Predicate<Instructor> p1= (i) -> i.isOnlineCourses()==true;
		//experience >10
		
		Predicate<Instructor> p2= (i) ->i.getYearOfExperience() >10;
		
		List<Instructor> instructors = Instructors.getAll();
		instructors.forEach(instructor ->{
			if(p1.test(instructor)) {
				System.out.println(instructor);
			}
		});
		System.out.println("...........................");
		//is instructor teaches online and experience greater than 10
		instructors.forEach(instructor->{
			if(p1.and(p2).test(instructor)) {
				System.out.println(instructor);
			}
		});
	}

}
