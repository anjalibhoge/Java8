package com.demo.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class ConsumerExample2 {

	public static void main(String[] args) {
		List<Instructor> instructor = Instructors.getAll();
		//looping through all the instructor and printing the values of instructor
		Consumer<Instructor> c = (s1) -> System.out.println(s1);
		instructor.forEach(c);
		System.out.println(".................................");
		
		//loop through all the instructor and only print out their name
		Consumer<Instructor> c1 =(s2) -> System.out.println(s2.getName());
		instructor.forEach(c1);
		System.out.println(".................................");
		
		//loop through all the instructor and print out their name and courses
		Consumer<Instructor> c2 =(s3)->System.out.println(s3.getCourses());
		instructor.forEach(c1.andThen(c2));
		System.out.println(".................................");
		
		//loop through all instructor and print out their name if 
		//years of experience is > 10
		instructor.forEach(s1 -> {
			if(s1.getYearOfExperience() >10 ) {
				c.accept(s1);
			}
		});
		System.out.println(".................................");
		
		//print instructor name and years of experience if years of experience >5 and not teaches online
		instructor.forEach(s1 -> {
			if(s1.getYearOfExperience() >5 && !s1.isOnlineCourses()) {
				c.andThen(c1).accept(s1);
			}
		});
		
	}

}
