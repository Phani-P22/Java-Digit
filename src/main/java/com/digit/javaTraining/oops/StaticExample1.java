package com.digit.javaTraining.oops;

public class StaticExample1 {

	int a, b, c;
	static int m, n, o;

	static {
//		a = 10;
//		b = 20;  // Non static variables cannot be accessed by static member
//		c = 30;

		m = 1;
		n = 2;
		o = 3;
	}

	{
		// These will be executed right after object creation
		a = 10;
		b = 20; // Non static and static variables can be accessed by non static member
		c = 30;

		m = 11;
		n = 22;
		o = 33;
	}

	static void disp() {
		System.out.println(StaticExample1.m);
		System.out.println(StaticExample1.n);
		System.out.println(StaticExample1.o);
	}

	void disp2() {
		System.out.println(StaticExample1.m);
		System.out.println(StaticExample1.n);
		System.out.println(StaticExample1.o);
	}

	public static void main(String[] args) {

		System.out.println(StaticExample1.m);

		System.out.println(StaticExample1.n);

		System.out.println(StaticExample1.o);

		StaticExample1.disp();
	}
}
