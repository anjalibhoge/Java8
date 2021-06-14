package com.demo.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {
	@Override
	public int incrementByFive(int a) {
		return a + 5;
	}

	public static void main(String[] args) {
		IncrementByFiveTraditional incrementByFive = new IncrementByFiveTraditional();
		System.out.println(incrementByFive.incrementByFive(2));
		
	}

}
