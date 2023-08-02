package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class J4DArr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Universities: ");
		int uni = sc.nextInt();

		int[][][][] agesOfStudents = new int[uni][][][];

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In University: " + (i + 1));
			System.out.println("Enter number of Schools: ");
			int sch = sc.nextInt();
			agesOfStudents[i] = new int[sch][][];
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In University: " + (i + 1));
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				System.out.println("In School: " + (j + 1));
				System.out.println("Enter number of Classes: ");
				int cls = sc.nextInt();

				agesOfStudents[i][j] = new int[cls][];
			}
			System.out.println();
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In University: " + (i + 1));
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				System.out.println(("In School: " + (j + 1)));
				for (int k = 0; k < agesOfStudents[i][j].length; k++) {
					System.out.println("In Class: " + (k + 1));
					System.out.println("Enter number of Students: ");
					int stu = sc.nextInt();
					agesOfStudents[i][j][k] = new int[stu];
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int i = 0; i < agesOfStudents.length; i++) {
			System.out.println("In University: " + (i + 1));
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				System.out.println(("In School: " + (j + 1)));
				for (int k = 0; k < agesOfStudents[i][j].length; k++) {
					System.out.println("In Class: " + (k + 1));
					for (int l = 0; l < agesOfStudents[i][j][k].length; l++) {
						System.out.println("Enter age of Student: " + (l + 1));
						agesOfStudents[i][j][k][l] = sc.nextInt();
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Printing Information: ");
		for (int i = 0; i < agesOfStudents.length; i++) {
			for (int j = 0; j < agesOfStudents[i].length; j++) {
				for (int k = 0; k < agesOfStudents[i][j].length; k++) {
					for (int l = 0; l < agesOfStudents[i][j][k].length; l++) {
						System.out.print(agesOfStudents[i][j][k][l] + "  ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}