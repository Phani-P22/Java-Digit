package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CountSpecialChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter statement to count number of Consonants: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90) || (ch >= 48 && ch <= 57) || (ch >= 0 && ch <= 31))) {
				count++;
			}
		}
		
		System.out.println("Number of Special Chars: " + count);
	}
}
