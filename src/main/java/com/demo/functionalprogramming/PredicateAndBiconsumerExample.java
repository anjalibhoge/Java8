package com.demo.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class PredicateAndBiconsumerExample {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();

		//instructor who teaches online
		Predicate<Instructor> p1 =(i) -> i.isOnlineCourses()==true;
		
		//experience >10
		Predicate<Instructor> p2 = (i) -> i.getYearOfExperience() >10;
		
		// Biconsumer print name and courses
		BiConsumer<String,List<String>> biconsumer = (name,courses)->System.out.println("name: "+name + "courses : "+courses);
		 instructors.forEach(instructor ->{
			  if(p1.and(p2).test(instructor)) {
				  biconsumer.accept(instructor.getName(), instructor.getCourses());
			  }
		 });
		}
	}


