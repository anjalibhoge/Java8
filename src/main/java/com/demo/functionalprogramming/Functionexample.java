package com.demo.functionalprogramming;

import java.util.function.Function;

public class Functionexample {

	public static void main(String[] args) {
		//Square root
		Function<Integer, Double> squareroot=(x)->Math.sqrt(x);
		System.out.println("Square root is  "+ squareroot.apply(64));
		
		//lowerCase
		Function<String, String> lowercase =(x) ->x.toLowerCase();
		System.out.println("LowerCase : " +lowercase.apply("HELLO") );
		
		//concat
		Function<String, String> concatanate =(s)-> s.concat("In Java");
		//here 1st lower case and then concat
		System.out.println(lowercase.andThen(concatanate).apply("PROGRAMMING "));
		
		//if we want 1st concat and then lower case then use compose
		
		System.out.println(lowercase.compose(concatanate).apply("PROGRAMMING "));
	}

}
