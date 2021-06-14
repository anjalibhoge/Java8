package com.demo.functionalprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary =(i)->i*10;
		System.out.println(unary.apply(10));
		
		Function<Integer,Integer> funct =(i)->i*10;
		System.out.println(funct.apply(10));
		
		IntUnaryOperator intUnaryOperator = (i)->i*10;
		System.out.println(intUnaryOperator.applyAsInt(100));
		
		LongUnaryOperator longUnaryOperator =(i)->i*20L;
		System.out.println(longUnaryOperator.applyAsLong(1000000000000000000l));
		
		DoubleUnaryOperator doubleUnaryOperator =(i)->i*10;
		System.out.println(doubleUnaryOperator.applyAsDouble(1044.76));
		
	}

}
