package com.demo.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class CollectingMappingExample {

	public static void main(String[] args) {
			//map
		List<String> namesList=Instructors.getAll().stream()
				.map(Instructor::getName).collect(Collectors.toList());
		namesList.forEach(System.out::println);
		System.out.println(".................");
		
		//mapping
		namesList=Instructors.getAll().stream()
				.collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
		namesList.forEach(System.out::println);
		System.out.println(".................");
		
		//instructor by year of experience
		Map<Integer,List<String>> mapyearofexperienceAndNames=Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::getYearOfExperience,
				Collectors.mapping(Instructor::getName, Collectors.toList())));
		mapyearofexperienceAndNames.forEach((key,value)->{
			System.out.println("key : "+ key + "  value: " +value);
		});
	}

}
