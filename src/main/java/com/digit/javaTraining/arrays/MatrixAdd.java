package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of Columns: ");
		int n = sc.nextInt();
		
		int[][] array1 = new int[m][n];
		int[][] array2 = new int[m][n];
		
		System.out.println("Enter Array 1: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter Array 2: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		
		// Addition
		int[][] addedArr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				addedArr[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		System.out.println("Added Array is: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(addedArr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
