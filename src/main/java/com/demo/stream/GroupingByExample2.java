package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample2 {

	public static void main(String[] args) {
		// grouping by length of stream and also checking names contains "e"
		// and only return those names which has "e" in it

		List<String> names = Arrays.asList("Sid", "Mike", "Jenny", "Gene", "Rajeev");
		// Collectors.filtering() in java 9
		
		/*
		 * Map<Integer, List<String>> result = names.stream().collect(
		 * Collectors.groupingBy(String::length, Collectors.filtering(s ->
		 * s.contains("e"), Collectors.toList()))); 
		 * System.out.println(result);
		 */

	}

}
