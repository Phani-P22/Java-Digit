package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter statement: ");
		String str = sc.nextLine();

		int len = str.split(" ").length;

		System.out.println("No of Words: " + len);
	}
}
