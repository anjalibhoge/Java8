package com.demo.interview;

public class TestEx1 {
	int x=10;
	//System.out.println(x);
	
	public  void print(int a) {
		x=a;
		System.out.println(x);
		//Employee e= new Employee();
	}
	public static void main(String[] args) {
		TestEx1 t= new TestEx1();
		t.print(12);
		//System.out.println(t.print(12));

	}

}
