package com.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
	public static List<Employee> getAll(){
		List<Employee> emplist = new ArrayList<>();
		Employee emp1 = new Employee("harsh",20,"Banglore");
		Employee emp2 = new Employee("Kajol",60,"Amt");
		Employee emp3 = new Employee("Dipi",87,"Surat");
		Employee emp4 = new Employee("Aniket",54,"Amt");
		Employee emp5 = new Employee("Ojasvi",34,"Banglore");
		Employee emp6 = new Employee("pal",34,"Banglore");
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		return emplist;
	}
public static void main(String[] args) {
	
	//Qu 1  create a map using java 8 having key as city and value as employee
	Map<String, List<Employee>> mapList= MapExample.getAll().stream().collect(Collectors.groupingBy(Employee::getCity));
	mapList.forEach((k,v)-> System.out.println("city: "+ k + "Employee :"+ v));
	//or
	Map<String, List<Employee>> map = getAll().stream()
			.collect(Collectors.groupingBy(Employee::getCity,Collectors.toList()));
	for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
		
		System.out.println(entry.getKey() + "  ------  "+ entry.getValue());
	}
}
}
	

