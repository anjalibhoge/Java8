package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 4, 5);
		int addition = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println( "addition : "+ addition);
		
		int multiplication = numbers.stream().reduce(1, (a,b)->a*b);
		System.out.println("multiplication : " + multiplication);
		System.out.println("...............................");
		
		
		Optional<Integer> add = numbers.stream().reduce((a,b)->a+b);
		if(add.isPresent()) {
			System.out.println(add.get());
		}
		System.out.println("...............................");
		
		List<Integer> numbers2 = Arrays.asList();
		Optional<Integer> result = numbers2.stream().reduce((a,b)->a+b);
		if(result.isPresent()) {
			System.out.println(result.get());//Exception will throw if no value present so need to check first
		}
	}

}
