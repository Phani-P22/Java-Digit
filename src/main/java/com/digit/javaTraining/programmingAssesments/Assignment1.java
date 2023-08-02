package com.digit.javaTraining.programmingAssesments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password to test: ");
		String password = sc.nextLine();
		
		boolean hasDigit = false;
		boolean hasSpecialChars = false;
		
		if (!(password.length() >= 6 && password.length() <= 20)) {
			System.out.println("Bad password");
			return;
		}
		
		for (char ch: password.toCharArray()) {
			if (ch >= 48 && ch <= 57) {
				hasDigit = true;
			}
			else if (ch == '@' || ch == '#' || ch == '$' || ch == '%') {
				hasSpecialChars = true;
			}
		}
		
		if (hasDigit && hasSpecialChars) {
			System.out.println("Password is good");
		} else {
			System.out.println("Bad password");
			if (!hasDigit) {
				System.out.println("Password needs to have atleast 1 digit");
			}
			if (!hasSpecialChars) {
				System.out.println("Password needs to have atleast 1 special character");
			}
		}
	}
}
