package com.demo.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class FunctionExample2 {

	public static void main(String[] args) {
		//map of instructor with name and years of experience
		//function which is List<Instructor> and return Map<String,Integer>
		//predicate will return true if instructor has online courses
		Predicate<Instructor> p1 = (i) ->i.isOnlineCourses()==true;
		
		Function<List<Instructor>,Map<String,Integer>> mapFunction =(instructors ->{
			Map<String,Integer> map =new HashMap<>();
			instructors.forEach(instructor->{
				if(p1.test(instructor)) {
				map.put(instructor.getName(),instructor.getYearOfExperience());
				}
			});
			return map;
			
			
		});
		System.out.println(mapFunction.apply(Instructors.getAll()));
	}

}
