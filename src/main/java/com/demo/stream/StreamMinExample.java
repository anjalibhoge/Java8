package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 2, 4, 67, 1, 3, 56);
		
		//stream min function 
		Optional result = list.stream().min(Integer::compareTo);
		if(result.isPresent()) {
			System.out.println(result.get());
		}
		System.out.println("...................");
		
		//reduce function---giving wrong ans due to identifier which is 0
				//0,1 -- 0
				//0,2 -- 0
				//0,3 -- 0
		int result1= list.stream().reduce(0, (a,b)->a<b?a:b);
		System.out.println(result1);
		System.out.println("...................");
		
		//solution is here--without identifier
		
		Optional result2= list.stream().reduce((a,b)->a<b?a:b);
		if(result2.isPresent()) {
			System.out.println(result2.get());
		}
		System.out.println("..............");
		
		Optional result3= list.stream().reduce(Integer::min);
		if(result3.isPresent()) {
			System.out.println(result3.get());
		}
		System.out.println("..............");
	}

}
