package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CountConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter statement to count number of Consonants: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
					count++;
				}
			}
		}
		
		System.out.println("Number of Consonants: " + count);
	}
}
