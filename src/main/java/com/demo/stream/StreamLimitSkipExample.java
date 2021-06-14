package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitSkipExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,45,6,7,8,8,9,7,5);
		//limit
		List limit5Numbers =numbers.stream().limit(5).collect(Collectors.toList());
		limit5Numbers.forEach(System.out::println);
		//skip
		System.out.println(".......................");
		List skip5Numbers =numbers.stream().skip(5).collect(Collectors.toList());
		skip5Numbers.forEach(System.out::println);
	}

}
