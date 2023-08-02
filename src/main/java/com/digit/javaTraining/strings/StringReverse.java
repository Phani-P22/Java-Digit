package com.digit.javaTraining.strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String revString = "";
		
		for (int i = s1.length() - 1; i >= 0; i--) {
			revString += s1.charAt(i);
		}
		
		System.out.println("Reversed String of " + s1 + " is " + revString);
		
		if (revString.equals(s1)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
