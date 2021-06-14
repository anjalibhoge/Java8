package com.demo.lambda;

public class ConcatanateLambda {

	public static void main(String[] args) {
		ConcatanateInterface concatanateInterface = (a, b) -> a + " " + b;
		System.out.println(concatanateInterface.sconcat("Hello", "World"));
	}

}
