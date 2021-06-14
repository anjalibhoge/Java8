package com.demo.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.length());
		c.accept("anjali");
		
		//consumer with block statement
		Consumer<Integer> d =(x) -> {
			System.out.println("x*x  = "+x*x );
			System.out.println("x/x  = "+x/x );
		};
		d.accept(10);
	}

}
 