package com.demo.interview;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {

		//Optional<String> str = Optional.of(null);
		//System.out.println(str.isPresent()); 
		
		String name = "Anjali";
		Employee emp = new Employee();
		emp.setName("Anjali");
		show(name, emp);
		
		System.out.println(name);
		System.out.println(emp.getName());
		
		
	}
	
	
	static void show(String name, Employee e) {
		name = "Harshal";
		
	e = new Employee();
	e.setName("Dada");
	
	System.out.println(e.getName());
		
	}

}
