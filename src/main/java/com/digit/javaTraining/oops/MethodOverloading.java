package com.digit.javaTraining.oops;

class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	float add(float a, float b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	double add(int a, int b, double c) {
		return a + b + c;
	}
	
	float add(int a, float b) {
		return a + b;
	}
	
	double add(int a, float b, double c) {
		return a + b + c;
	}
	
	float add(float a, int b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int a = 10, b = 20, cc = 30;
		float m = 30.7f, n = 20.7f, o = 10.7f;
		double p = 300.37, q = 200.37, r = 100.37;
		
		System.out.println(c.add(a, m));
		System.out.println(c.add(m, n));
		System.out.println(c.add(a, b, p));
		System.out.println(c.add(cc, o));
		System.out.println(c.add(m, q));
		System.out.println(c.add(a, b, r));
	}
}
