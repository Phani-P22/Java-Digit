package com.digit.javaTraining.strings;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "India";
		String b = "India";

		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (a == b) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (a.compareTo(b) == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		if (a.compareToIgnoreCase(b) == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
