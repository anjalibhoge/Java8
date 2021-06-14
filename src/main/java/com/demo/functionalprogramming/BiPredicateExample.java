package com.demo.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class BiPredicateExample {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		
		//bipredicate
		BiPredicate<Boolean, Integer> p3 =(online,experience)->online==true && experience >10;
		
		// Biconsumer print name and courses
		BiConsumer<String,List<String>> biconsumer = (name,courses)->System.out.println("name: "+name + "courses : "+courses);
		 instructors.forEach(instructor ->{
			  if(p3.test(instructor.isOnlineCourses(),instructor.getYearOfExperience())) {
				  biconsumer.accept(instructor.getName(), instructor.getCourses());
			  }
		 });
		 
	}

}
