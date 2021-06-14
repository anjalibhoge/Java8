package com.demo.lambda;

public class IncrementByFiveLambda {

	public static void main(String[] args) {
		IncrementByFiveInterface incrementByFive = a -> a+5 ;
		System.out.println(incrementByFive.incrementByFive(2));
	}

}
