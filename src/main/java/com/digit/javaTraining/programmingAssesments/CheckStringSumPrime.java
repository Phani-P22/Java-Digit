package com.digit.javaTraining.programmingAssesments;

import java.util.Scanner;

public class CheckStringSumPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String input = sc.next();

		int count = 0;

		for (char ch : input.toCharArray()) {
			count += ch;
		}

		System.out.println(count);

		boolean isPrime = true;
		for (int i = 2; i < count; i++) {
			if (count % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Count: " + count + " is a Prime");
		} else {
			System.out.println("Count: " + count + " is not a Prime");
		}
	}

}
