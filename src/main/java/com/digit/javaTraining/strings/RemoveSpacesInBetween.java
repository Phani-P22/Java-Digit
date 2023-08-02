package com.digit.javaTraining.strings;

import java.util.Scanner;

public class RemoveSpacesInBetween {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter statement: ");
		String str = sc.nextLine();

		String[] words = str.split(" ");
		String newStmt = "";
				
		for (String word: words) {
			if (!(word.isBlank() ||  word.isEmpty())) {
				newStmt += word + " ";
			}
		}
		
		System.out.println(newStmt);
	}
}
