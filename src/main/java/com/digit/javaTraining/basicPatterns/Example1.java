package com.digit.javaTraining.basicPatterns;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " student's name: ");
			names[i] = sc.next();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Student name of " + i + " is: " + names[i]);
		}
	}
}