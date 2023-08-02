package com.digit.javaTraining.strings;

import java.util.Scanner;

public class VowelCharsReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.toLowerCase();
		String newString = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
			case 'a':
				newString += '$';
				break;
			case 'e':
				newString += '#';
				break;
			case 'i':
				newString += '@';
				break;
			case 'o':
				newString += '&';
			case 'u':
				newString += '^';
				break;
			default:
				newString += ch;
				break;
			}
		}
		
		System.out.println("New String: " + newString);
	}
}
