package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter statement to count numbers existing: ");
		String str = sc.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		
		System.out.println("Count of numbers: " + count);
	}
}
