package com.digit.javaTraining.strings;

import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter statement: ");
		String str = sc.nextLine();

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				newStr += '@';
			} else {
				newStr += ch;
			}
		}

		System.out.println("New String: " + newStr);
	}

}
