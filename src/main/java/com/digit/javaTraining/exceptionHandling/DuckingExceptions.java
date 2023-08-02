package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

public class DuckingExceptions {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		Operator op = new Operator();
		op.function3();
		System.out.println("Left Main");
	}
}

class Operator {
	void function1() throws ArithmeticException{
		System.out.println("Inside F-1");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int div = a / b;
		System.out.println(div);
		System.out.println("Left F-1");
	}

	void function2() throws ArithmeticException{
		System.out.println("Inside F-2");
		function1();
		System.out.println("Left F-2");
	}

	void function3() {
		try {
			System.out.println("Inside F-3");
			function2();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Left F-3");
	}
}
