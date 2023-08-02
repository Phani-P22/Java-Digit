package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class JArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter count of classes: ");
		int cls = sc.nextInt();
		
		String[][] arr = new String[cls][];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the count of students in class: " + (i + 1));
			int stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("In class: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter name of student: " + (i + 1));
				arr[i][j] = sc.nextLine();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("In class: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
