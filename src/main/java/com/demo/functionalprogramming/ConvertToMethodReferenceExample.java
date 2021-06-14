package com.demo.functionalprogramming;

import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class ConvertToMethodReferenceExample {

	public static void main(String[] args) {

		//Predicate<Instructor> p2 = (i) -> i.getYearOfExperience() > 10;
		Predicate<Instructor> p2=ConvertToMethodReferenceExample::greaterThanTenYearOfExperience;
		Instructors.getAll().forEach(instructor ->{
			if(p2.test(instructor)) {
				System.out.println(instructor);
			}
		});
		
	}

	public static boolean greaterThanTenYearOfExperience(Instructor instructor) {
		if (instructor.getYearOfExperience() > 10)
			return true;
		return false;
	}

}
