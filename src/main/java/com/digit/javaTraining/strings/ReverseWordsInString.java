package com.digit.javaTraining.strings;

import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Statement: ");
		String stmt = sc.nextLine();
		String[] words = stmt.split(" ");

		String newStmt = "";

		for (String word : words) {
			String newWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				newWord += word.charAt(i);
			}
			newStmt += newWord + " ";
		}

		System.out.println("Reversed Word wise: " + newStmt);
	}

}
