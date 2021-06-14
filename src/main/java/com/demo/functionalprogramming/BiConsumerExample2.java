package com.demo.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

import com.demo.pojo.Instructor;
import com.demo.pojo.Instructors;

public class BiConsumerExample2 {

	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		//print name and gender
		BiConsumer<String, String> biconsumer =(name,gender) ->System.out.println("name is  : "+ name + " and gender is : " +gender);
		instructors.forEach(instructor -> {
			biconsumer.accept(instructor.getName(), instructor.getGender());
		});
		
		//name and list of courses
		BiConsumer<String, List<String>> biconsumer1 =(name,courses) ->System.out.println("name is  : "+ name + " and courses is : " +courses);
	instructors.forEach(instructor ->{
		biconsumer1.accept(instructor.getName(), instructor.getCourses());
	});
	
	System.out.println("..................");
	
	//name and gender who teaches online
	instructors.forEach(instructor ->{
		if(instructor.isOnlineCourses()) {
			biconsumer.accept(instructor.getName(), instructor.getGender());
		}
	});
	
	}

}
