package com.demo.stream;

import java.util.Optional;

import com.demo.pojo.Instructors;

public class StreamFindAnyAndFirstExample {

	public static void main(String[] args) {
		//findFirst
		Optional instructor = Instructors.getAll().stream().findFirst();
		if (instructor.isPresent()) {
			System.out.println(instructor.get());
		}
		System.out.println("............");
		
		//findAny
		Optional instructorFindAny = Instructors.getAll().stream().findAny();
		if (instructorFindAny.isPresent()) {
			System.out.println(instructorFindAny.get());
		}
	}

}
