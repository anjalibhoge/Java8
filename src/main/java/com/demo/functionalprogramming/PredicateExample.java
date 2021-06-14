package com.demo.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		//if no greater than 10 return true
		Predicate<Integer> p1 = (i) -> i > 10;
		System.out.println(p1.test(34));
		
		System.out.println("...............");
		//if no >10 and no is even
		Predicate<Integer> p2 = (i) -> i%2 == 0;
		System.out.println(p1.and(p2).test(20));
		System.out.println("...............");
		
		//if no >10 Or no is even
		System.out.println(p1.or(p2).test(13));
		
		//no > 0 and no is odd(i%2 != 0)
		System.out.println(p1.and(p2.negate()).test(33));
	}

}
