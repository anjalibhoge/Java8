package com.demo.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// printing two no
		BiConsumer<Integer, Integer> biconsumer = (x, y) -> System.out.println("x : " + x + " and y :" + y);
		biconsumer.accept(10, 12);
		
		//sum of two integer
		BiConsumer<Integer,  Integer> biconsumer1 =(x,y) ->System.out.println("x+y : "+ (x+y));
		biconsumer1.accept(10, 12);
		
		//Concatenate string
		BiConsumer<String,  String> biconsumer2 =(x,y) ->System.out.println("Concatenate :"+ x+y);
		biconsumer2.accept("hello", "everyone");
	}

}
