package com.digit.javaTraining.arrays;

import java.util.Scanner;

public class MatrixMul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Rows For Matrix 1: ");
		int m = sc.nextInt();
		System.out.println("Enter number of Columns for Matrix 1: ");
		int n = sc.nextInt();
		int[][] array1 = new int[m][n];		
		System.out.println("Enter Array 1: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter number of Rows For Matrix 2: ");
		int a = sc.nextInt();
		System.out.println("Enter number of Columns for Matrix 2: ");
		int b = sc.nextInt();
		int[][] array2 = new int[a][b];		
		System.out.println("Enter Array 1: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		
		if (n != a) {
			System.out.println("Matrix Multiplication is not Possible!");
			return;
		}


		// Multiplication
		int[][] mulArr = new int[m][b];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < n; k++) {
					mulArr[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}
		
		System.out.println("Added Array is: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(mulArr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
