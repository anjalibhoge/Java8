package com.demo.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class GroupingMinMaxAvgExample {

	public static void main(String[] args) {
		//grouping the instructors who teaches online courses vr not nonline courses
		//get max years of experience of the instructor
		
		//here boolean -for is online courses and optional - for maxby
		Map<Boolean,Optional<Instructor>> maxInstructor =Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience))));
		maxInstructor.forEach((key,value)->{
			System.out.println("key = "+key + " value = "+ value);
		});
		System.out.println(".............................");
		
		//collecting and then
		
		Map<Boolean,Instructor> maxInstructor1 =Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience))
						,Optional::get)));
		maxInstructor1.forEach((key,value)->{
			System.out.println("key = "+key + " value = "+ value);
		});
		System.out.println("........................");
		
		//average years of experience who teaches online or not
		
		Map<Boolean,Double> averageInstructor =Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.averagingInt(Instructor::getYearOfExperience)));
		averageInstructor.forEach((key,value)->{
			System.out.println("key = "+key + " value = "+ value);
		});
		System.out.println("........................");
		
		//drive statistical summary from properties of  grouped item
		
		Map<Boolean,IntSummaryStatistics> averageInstructor2 =Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
						Collectors.summarizingInt(Instructor::getYearOfExperience)));
		averageInstructor2.forEach((key,value)->{
			System.out.println("key = "+key + " value = "+ value);
		});
		
	}

}
