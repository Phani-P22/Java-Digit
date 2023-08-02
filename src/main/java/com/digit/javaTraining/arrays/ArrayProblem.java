package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class ArrayProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of schools: ");
		int sch = sc.nextInt();

		System.out.println("Enter number of classes: ");
		int cls = sc.nextInt();

		System.out.println("Enter number of students: ");
		int stu = sc.nextInt();

		int[][][] ages = new int[sch][cls][stu];

		for (int i = 0; i < sch; i++) {
			System.out.println("School: " + (i + 1));
			for (int j = 0; j < cls; j++) {
				System.out.println("Class: " + (j + 1));
				for (int k = 0; k < stu; k++) {
					System.out.println("Student: " + (k + 1));
					ages[i][j][k] = sc.nextInt();
				}
			}
		}

		System.out.println("Priniting: ");
		for (int i = 0; i < sch; i++) {
			System.out.println("School: " + (i + 1));
			for (int j = 0; j < cls; j++) {
				System.out.println("Class: " + (j + 1));
				for (int k = 0; k < stu; k++) {
					System.out.println("Student Age: " + ages[i][j][k]);
				}
			}
		}
	}
}
