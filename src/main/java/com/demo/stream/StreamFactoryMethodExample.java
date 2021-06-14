package com.demo.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {

	public static void main(String[] args) {
		//of() method
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		stream.forEach(System.out::println);
		System.out.println("...............");
		
		//iterate()--generate  stream of 10 even no
		Stream<Integer> stream1 = Stream.iterate(0, i->i+2).limit(10);
		stream1.forEach(System.out::println);
		System.out.println("...............");
		
		//generate()--generate 10 random no
		Stream<Integer> stream2=Stream.generate(new Random()::nextInt).limit(10);
		stream2.forEach(System.out::println);
		System.out.println("...............");
		
		
		
	}

}
