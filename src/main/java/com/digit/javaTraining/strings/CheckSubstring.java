package com.digit.javaTraining.strings;

import java.util.Scanner;

public class CheckSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String str = sc.nextLine();

		System.out.println("Enter Substring: ");
		String subStr = sc.nextLine();
		
		boolean contains = false;
		
		for (int i = 0; i <= (str.length() - subStr.length()); i++) {
			int index = 0;
			for (int j = i; j <= str.length(); j++) {
				if (index >= subStr.length()) {
					contains = true;
					continue;
				}
				if (str.charAt(j) == subStr.charAt(index)) {
					index++;
				} else {
					index = 0;
					break;
				}
			}
		}
		
		System.out.println("Substring contains: " + contains);
	}
}
