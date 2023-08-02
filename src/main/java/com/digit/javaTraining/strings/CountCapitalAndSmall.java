package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CountCapitalAndSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter statement to count number of vowels: ");
		String str = sc.nextLine();
		
		int capitalCount = 0;
		int smallCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				capitalCount++;
			} else if (ch >= 97 && ch <= 122) {
				smallCount++;
			}
		}
		
		System.out.println("Capital Count: " + capitalCount);
		System.out.println("Small Count: " + smallCount);
	}
}
