package com.digit.javaTraining.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number A: ");
			int a = sc.nextInt();
			System.out.println("Enter number B: ");
			int b = sc.nextInt();

			int div = a / b;
			System.out.println("Division: " + div);

			System.out.println("Enter Array Length: ");
			int n = sc.nextInt();
			int arr[] = new int[n];

			System.out.println("Enter array elements: ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("Enter index to where insert: ");
			int index = sc.nextInt();
			System.out.println("Enter element: ");
			int el = sc.nextInt();

			arr[index] = el;
			System.out.println("Updated arr: ");
			for (int i = 0; i < n; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException e1) {
			System.out.println("ArithmeticException: " + e1.getMessage());
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array related Exception: " + e2.getMessage());
		} catch (InputMismatchException | NullPointerException e4) {
			System.out.println("Input related Exception: " + e4.getMessage());
		} catch (Exception e) {
			System.out.println("Exception handled by Generic Catch");
		}
	}
}
