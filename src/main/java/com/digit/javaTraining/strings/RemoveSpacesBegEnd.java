package com.digit.javaTraining.strings;

import java.util.Scanner;

public class RemoveSpacesBegEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter statement: ");
		String str = sc.nextLine();

		String newStr = str.strip();

		System.out.println("New String: " + newStr);
	}
}
