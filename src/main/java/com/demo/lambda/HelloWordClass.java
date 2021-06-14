package com.demo.lambda;

public class HelloWordClass {

	public static void main(String[] args) {
		//implementing sayHello method using lambda 8 
		HelloWordInterface helloWord = ()-> "helloWord";
			
		System.out.println(helloWord.sayHello());
	}

}
