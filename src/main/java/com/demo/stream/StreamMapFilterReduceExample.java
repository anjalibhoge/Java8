package com.demo.stream;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {

		//total years of experience between instructors
		int result = Instructors.getAll().stream()
				.map(Instructor::getYearOfExperience).reduce(0, (a, b) -> a + b);
		System.out.println(result);
		System.out.println(".....................");
		
		//total years of experience between instructors who teaches online
		 
		int result1 =Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearOfExperience)
				.reduce(0,(a,b)->a+b);
		System.out.println(result1);
		System.out.println(".....................");
		
		int result2 =Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearOfExperience)
				.reduce(0,Integer::sum);
		
		System.out.println(result2);
		System.out.println(".....................");			
	}

}
