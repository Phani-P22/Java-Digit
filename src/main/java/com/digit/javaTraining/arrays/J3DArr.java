package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class J3DArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Schools: ");
		int sch = sc.nextInt();

		int[][][] agesOfStudents = new int[sch][][];

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In School: " + (i + 1));
			System.out.println("Enter number of Classes: ");
			int cls = sc.nextInt();
			agesOfStudents[i] = new int[cls][];
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In School: " + (i + 1));
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				System.out.println("In Class: " + (j + 1));
				System.out.println("Enter number of Students: ");
				int stu = sc.nextInt();

				agesOfStudents[i][j] = new int[stu];
			}
			System.out.println();
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In School: " + (i + 1));
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				System.out.println(("In Class: " + (j + 1)));
				for (int k = 0; k < agesOfStudents[i][j].length; k++) {
					System.out.println("Enter age of Student: " + (k + 1));
					agesOfStudents[i][j][k] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				for (int k = 0; k < agesOfStudents[i][j].length; k++) {
					System.out.print(agesOfStudents[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
