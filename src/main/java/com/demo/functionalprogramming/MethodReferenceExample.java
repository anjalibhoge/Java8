package com.demo.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

import com.demo.pojo.Instructor;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		
		Function<Integer,Double> f1 =(i)->Math.sqrt(i);
		Function<Integer,Double> f2=Math::sqrt;
		
		Function<String,String> f3=String::toLowerCase;
		
		

	}

}
