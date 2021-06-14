package com.demo.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class BiFunctionExample {

	public static void main(String[] args) {
		// bifunction two input 1st is List<Instructor> 2nd is predicate
		// which filter if instructor has online courses and return map<String,Integer>
		// string is name and integer is years of experience
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
		BiFunction<List<Instructor>,Predicate<Instructor> , Map<String,Integer>> mapBiFunction
									=((instructors,instructorPredicate)->{
			Map<String,Integer> map = new HashMap<>();
			instructors.forEach(instructor->{
				if(instructorPredicate.test(instructor)) {
					map.put(instructor.getName() , instructor.getYearOfExperience());
				}
			});
			return map;
		});
System.out.println(mapBiFunction.apply(Instructors.getAll(), p1));
	}

}
