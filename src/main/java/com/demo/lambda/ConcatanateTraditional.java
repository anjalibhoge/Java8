package com.demo.lambda;

public class ConcatanateTraditional implements ConcatanateInterface{
	@Override
	public String sconcat(String a, String b) {
		return a +" "+ b;
	}
	
	public static void main(String[] args) {
		ConcatanateTraditional concatanateTraditional = new ConcatanateTraditional();
		System.out.println(concatanateTraditional.sconcat("Hello", "World"));
		
	}

	
}
