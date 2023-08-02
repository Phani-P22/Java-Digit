package com.digit.javaTraining.programmingAssesments;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements of Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Second Largest: " + arr[n - 2]);
	}
}
