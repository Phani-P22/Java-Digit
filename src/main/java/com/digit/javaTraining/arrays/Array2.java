package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Classes: ");
		int cls = sc.nextInt();
		System.out.println("Enter the count of students: ");
		int stu = sc.nextInt();
		
		String[][] arr = new String[cls][stu];
		
		for (int i = 0; i < cls; i++) {
			System.out.println("Class Number: " + (i + 1));
			for (int j = 0; j < stu; j++) {
				System.out.println("Enter student name: ");
				arr[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("Printing Names");
		for (int i = 0; i < cls; i++) {
			System.out.println("Current Class Number: " + (i + 1));
			for (int j = 0; j < stu; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		sc.close();
	}
}
