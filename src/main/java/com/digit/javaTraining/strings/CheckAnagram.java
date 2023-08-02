package com.digit.javaTraining.strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter String 2: ");
		String s2 = sc.nextLine();
		
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		
		if (Arrays.equals(s1Chars, s2Chars)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}		
	}
}

