package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class GroupingByExample1 {

	public static void main(String[] args) {
		//group list of names by there length
		List<String> names =Arrays.asList("Syed","Mike","Jenny","Gene","Rajeev");
				//List.of("Syed","Mike","Jenny","Gene","Rajeev");
		
		Map<Integer,List<String>> map= names
				.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		System.out.println("................................");
		
		//grouping by instructors by there gender
		
		Map<String,List<Instructor>> instructorByGender = Instructors.getAll()
				.stream().collect(Collectors.groupingBy(Instructor::getGender));
		instructorByGender.forEach((key,value)->{
			System.out.println("key : "+ key + " value : "+ value );
		});
		System.out.println("................................");
		
		//grouping by experience where >10 as senior and others are junior 
		
		Map<String,List<Instructor>> instructorsByExperience =Instructors.getAll()
				.stream()
				.collect(Collectors.groupingBy(instructor ->instructor.getYearOfExperience() >10 ?"Senoir":"Junior"));
		
		instructorsByExperience.forEach((key,value)->{
			System.out.println("key : "+ key + " value : "+ value );
		});
	}

}
