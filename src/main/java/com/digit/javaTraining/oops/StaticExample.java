package com.digit.javaTraining.oops;

import java.util.Scanner;

class Employee {
	String name;
	int age;
	long phNo;

	static String compName;
	static int CTC;
	static int pfDeduction;

	static {
		compName = "DIGIT INSURANCE";
		CTC = 450000;
		pfDeduction = 3000;
	}

	void setDetails() {
		System.out.println("Enter Your Details in Here");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name: ");
		name = sc.nextLine();

		System.out.println("Enter Your Age: ");
		age = sc.nextInt();

		System.out.println("Enter Your Phone Number: ");
		phNo = sc.nextInt();
		
		System.out.println();
	}

	void printDetails() {
		System.out.println("-------");
		System.out.println("Hey Employee! Here's Your Details: ");

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phNo);
		System.out.println("Company Name: " + compName);
		System.out.println("CTC: " + CTC);
		System.out.println("EPF Deduction: " + pfDeduction);

		System.out.println("-------");
	}
}

public class StaticExample {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setDetails();

		Employee e2 = new Employee();
		e2.setDetails();

		Employee e3 = new Employee();
		e3.setDetails();

		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
}
