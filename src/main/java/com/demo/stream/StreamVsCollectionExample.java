package com.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Chunky");
		names.add("Shahid");
		names.add("Dipi");
		names.add("Priyanka");
		System.out.println(names);
		System.out.println(".............");
		names.remove("Dipi");
		System.out.println(names);
		System.out.println(".............");
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println(".............");

		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		
	}

}
