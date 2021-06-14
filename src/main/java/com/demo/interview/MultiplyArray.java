package com.demo.interview;

import java.util.Arrays;
import java.util.List;

public class MultiplyArray {
//multiply elements in array using java 8 features
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 4, 1, 4 };
		int result = Arrays.stream(array).reduce(1, (a, b) -> a * b);
		System.out.println(result);
	}

}
